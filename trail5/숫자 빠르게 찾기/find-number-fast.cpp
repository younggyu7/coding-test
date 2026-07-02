#include <iostream>
#include <vector>
using namespace std;

vector<int> v;
int bin_search(int target, int n) {
    int left = 0;
    int right = n - 1;
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if (v[mid] == target) return mid + 1;
        else if (v[mid] > target) right = mid - 1;
        else left = mid + 1;
    }
    return -1;
}
int main() {
    int n, m;
    cin >> n >> m;
    v.assign(n, 0);
    for (int i = 0; i < n; i++) {
        cin >> v[i];
    }
    for (int i = 0; i < m; i++) {
        int tmp;
        cin >> tmp;
        cout << bin_search(tmp, n) << "\n";
    }
    return 0;
}