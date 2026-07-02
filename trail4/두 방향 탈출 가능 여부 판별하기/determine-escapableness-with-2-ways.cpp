#include <iostream>
#include <vector>
using namespace std;
vector<vector<bool>> visited;
vector<vector<int>> graph;
int dx[] = {1, 0};
int dy[] = {0, 1};
int n, m;

void dfs(int x, int y){
    visited[x][y] = true;
    for (int i = 0; i < 2; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
        if (visited[nx][ny]) continue;
        if (graph[nx][ny] == 0) continue;
        dfs(nx, ny);
    }
}
int main() {
    cin >> n >> m;
    graph.assign(n, vector<int>(m));
    visited.assign(n, vector<bool>(m, false));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> graph[i][j];
        }
    }
    dfs(0, 0);
    if(visited[n - 1][m - 1]) cout << 1;
    else cout << 0;
    return 0;
}