#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<vector<int>> graph;
vector<vector<bool>> visited;
int n, m;
int dx[] = {-1, 1, 0, 0};
int dy[] = {0, 0, -1, 1};

void dfs(vector<vector<int>> &graph, int x, int y) {
    visited[x][y] = true;
    for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
        if (visited[nx][ny]) continue;
        if (graph[nx][ny] == 0) continue;
        dfs(graph, nx, ny);
    }
}
int main() {
    int max_height = -1;
    int ans_safty = 0;
    int ans_k = 1;
    cin >> n >> m;
    graph.assign(n, vector<int>(m));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> graph[i][j];
            max_height = max(max_height, graph[i][j]);
        }
    }
    for (int k = 1; k <= max_height; k++) {
        vector<vector<int>> tmp = graph;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] <= k) tmp[i][j] = 0;
                else tmp[i][j] = 1;
            }
        }
        visited.assign(n, vector<bool>(m, false));
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j]) continue;
                if (tmp[i][j] == 0) continue;
                dfs(tmp, i, j);
                cnt++;
            }
        }
        if (cnt > ans_safty) {
            ans_safty = cnt;
            ans_k = k;
        }
    }
    cout << ans_k << " " << ans_safty;
    return 0;
}