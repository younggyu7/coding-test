#include <iostream>
#include <vector>
using namespace std;

vector<vector<long long>> dist;
vector<vector<int>> nxt;
const long long INF = 4e18;

void FW(int n){
    for (int k = 1; k <= n; k++) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if (dist[i][k] == INF || dist[k][j] == INF) continue;
                if (dist[i][j] > dist[i][k] + dist[k][j]) {
                    dist[i][j] = dist[i][k] + dist[k][j];
                    nxt[i][j] = nxt[i][k];
                }
            }
        }
    }
}

int main() {
    int n, m;
    cin >> n >> m;
    dist.assign(n + 1, vector<long long>(n + 1, INF));
    nxt.assign(n + 1, vector<int>(n + 1, -1));

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <=n; j++){
            cin >> dist[i][j];
            nxt[i][j] = j;
        }
    }
    FW(n);
    for (int i = 0; i < m; i++) {
        int from, to;
        cin >> from >> to;
        if (nxt[from][to] == -1) cout << "-1";
        for (int k = 1; k <= n; k++) {
            if (dist[from][k] != INF && dist[k][k] < 0 && dist[k][to] != INF) {
                cout << -1;
            }
        }
        // vector<int> path;
        // int cur = from;
        // while(cur != to) {
        //     path.push_back(cur);
        //     cur = nxt[cur][to];
        // }
        // path.push_back(to);
        cout << dist[from][to] << "\n";
    }
    return 0;
}
