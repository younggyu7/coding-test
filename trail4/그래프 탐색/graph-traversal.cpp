#include <iostream>
#include <vector>

using namespace std;
vector<vector<int>> graph;
vector<bool> visited;

void dfs(int cur) {
    int start = cur;
    visited[start] = true;
    for (int i = 0; i < graph[start].size(); i++){
        int next = graph[start][i];
        if (visited[next]) continue;
        dfs(next);
    }
}
int main() {
    int n, m;
    cin >> n >> m;
    graph.assign(n + 1, vector<int>());
    visited.assign(n + 1, false);
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }
    dfs(1);
    int cnt = 0;
    for (int i = 2; i < visited.size(); i++) {
        if(visited[i]) cnt++;
    }
    cout << cnt;
    return 0;
}