#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<string> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    char alp;
    cin >> alp;
    
    int cnt = 0;
    int total = 0;
    for (int i = 0 ; i < n; i++) {
        if (arr[i][0] == alp) {
            cnt++;
            total += arr[i].length();
        }
    }
    cout << cnt << " ";
    cout << fixed;
    cout.precision(2);
    cout << total / 1.0 / cnt;
    return 0;
}