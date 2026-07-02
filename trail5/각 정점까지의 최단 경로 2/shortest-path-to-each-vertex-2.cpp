#include <iostream>
#include <vector>
using namespace std;

const long long INF = 4e18;

vector<vector<long long>> dist;
vector<vector<int>> nxt;

void FW(int n) {
    for (int k = 1; k <= n; k++) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (dist[i][k] == INF || dist[k][j] == INF) continue;
                if (dist[i][j] > dist[i][k] + dist[k][j]){
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

    for (int i = 0; i <= n; i++) {
        dist[i][i] = 0;
    }
    for (int i = 0; i < m; i++) {
        int from, to;
        long long cost;
        cin >> from >> to >> cost;
        if (dist[from][to] > cost) {
            dist[from][to] = cost;
            nxt[from][to] = to;
        }
    }
    FW(n);
    // for (int k = 1; k <=n; k++) {
    //     if (dist[i][k] != INF && dist[k][k] < 0 && dist[k][j] != INF) {
    //         cout << "Ncycle";
    //         return 0;
    //     }
    // }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (dist[i][j] == INF) cout << "-1 ";
            else cout << dist[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}