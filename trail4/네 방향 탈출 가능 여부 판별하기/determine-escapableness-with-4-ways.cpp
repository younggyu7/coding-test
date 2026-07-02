#include <iostream>
#include <vector>
#include <queue>
using namespace std;

int n, m;
vector<vector<int>> graph;
vector<vector<bool>> visited;
int dx[] = {1, 0, 0, -1};
int dy[] = {0, 1, -1, 0};
void bfs(int x, int y){
    visited[x][y] = true;
    queue<pair<int,int>> q;
    q.push({x,y});
    while (!q.empty()) {
        int qx = q.front().first;
        int qy = q.front().second;
        q.pop();
        for (int i = 0; i < 4; i++) {
            int nx = qx + dx[i];
            int ny = qy + dy[i];
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if (graph[nx][ny] == 0) continue;
            if (visited[nx][ny]) continue;
            visited[nx][ny] = true;
            q.push({nx, ny});
        }
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
    bfs(0, 0);
    if (visited[n - 1][m - 1]) cout << 1;
    else cout << 0;
    return 0;
}