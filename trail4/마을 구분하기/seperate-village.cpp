#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<vector<int>> graph;
vector<vector<bool>> visited;
vector<int> peoples;
int people;
int dx[] = { -1, 1, 0, 0};
int dy[] = { 0, 0, -1, 1};
int n;

void dfs(int x, int y) {
    visited[x][y] = true;
    people++;
    for (int i = 0 ; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
        if (graph[nx][ny] == 0) continue;
        if (visited[nx][ny]) continue;
        dfs(nx, ny);
    }
}

int main() {
    cin >> n;
    graph.assign(n, vector<int>(n));
    visited.assign(n, vector<bool>(n, false));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> graph[i][j];
        }
    }
    int cnt = 0;
    people = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (visited[i][j]) continue;
            if (graph[i][j] == 0) continue;
            dfs(i, j);
            cnt++;
            peoples.push_back(people);
            people = 0;
        }
    }
    sort(peoples.begin(), peoples.end());
    cout << cnt << "\n";
    for (int x : peoples) {
        cout << x << "\n";
    }
    return 0;
}