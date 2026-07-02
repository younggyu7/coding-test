#include <iostream>
#include <vector>
#include <queue>
using namespace std;

int n, m;
const int INF = 1e9;
vector<vector<pair<int, int>>> graph;
vector<int> dist;
void dij(int start) {
    dist[start] = 0;
    priority_queue<pair<int, int>, vector<pair<int,int>>, greater<pair<int, int>>> pq;
    pq.push({0, start});
    while(!pq.empty()) {
        int curDist = pq.top().first;
        int cur = pq.top().second;
        pq.pop();
        if (curDist > dist[cur]) continue;
        for (auto &next : graph[cur]) {
            int nxt = next.first;
            int cst = next.second;
            if (dist[nxt] > dist[cur] + cst) {
                dist[nxt] = dist[cur] + cst;
                pq.push({dist[nxt], nxt});
            }
        }
    }
}
int main() {
    cin >> n >> m;
    graph.assign(n + 1, vector<pair<int,int>>());
    dist.assign(n + 1, INF);

    for (int i = 0; i < m; i++) {
        int from, to, cost;
        cin >> from >> to >> cost;
        graph[from].push_back({to, cost});
    }
    int start = 1;
    dij(start);
    for (int i = 2; i <= n; i++) {
        if (dist[i] == INF) cout << -1 << "\n";
        else cout << dist[i] << "\n";
    }
    return 0;
}
