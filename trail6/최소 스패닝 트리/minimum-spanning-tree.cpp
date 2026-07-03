#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int n, m;
vector<int> arr;
void Initialize() {
    for (int i = 1; i <= n; i++) {
        arr[i] = i;
    }
}
int Find(int x) {
    if (arr[x] == x) return x;
    else return arr[x] = Find(arr[x]);
}
void Union(int a, int b) {
    a = Find(a);
    b = Find(b);
    arr[a] = b; 
}

int main() {
    cin >> n >> m;
    vector<pair <int, pair <int, int>>> v;
    arr.assign(n + 1, 0);
    int T_cost = 0;
    for (int i = 0; i < m; i++) {
        int from, to, cost;
        cin >> from >> to >> cost;
        v.push_back({cost, {from, to}});
    }
    sort(v.begin(), v.end());
    Initialize();
    for (int i = 0; i < v.size(); i++) {
        int cost = v[i].first;
        int from = v[i].second.first;
        int to = v[i].second.second;
        if (Find(from) != Find(to)) {
            Union(from, to);
            T_cost += cost;
        }
    }
    cout << T_cost;
    return 0;
}