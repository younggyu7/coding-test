#include <iostream>
#include <vector>
using namespace std;

int main() {
    string str;
    int cnt = 0;
    vector<string> s;
    while (cin >> str) {
        if (str == "0") break;
        cnt++;
        if (cnt % 2 == 1) s.push_back(str);
    }
    cout << cnt << "\n";
    for (auto x : s) {
        cout << x << "\n";
    }
    return 0;
}