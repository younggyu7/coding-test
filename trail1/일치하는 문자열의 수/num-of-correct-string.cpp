#include <iostream>
using namespace std;

int main() {
    int n;
    string str;
    cin >> n >> str;
    int cnt = 0;
    for (int i = 0; i < n; i++) {
        string tmp;
        cin >> tmp;
        if (str == tmp) cnt++;
    }
    cout << cnt;
    return 0;
}