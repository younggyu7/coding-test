#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int total = 0;
    for (int i = 0; i < n; i++) {
        int tmp;
        cin >> tmp;
        total += tmp;
    }
    string str = to_string(total);
    int len = str.length();
    str = str.substr(1, len - 1) + str.substr(0, 1);\
    cout << str;
    return 0;
}