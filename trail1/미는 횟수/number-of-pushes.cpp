#include <iostream>
using namespace std;

int main() {
    string str1, str2;
    cin >> str1 >> str2;
    int cnt = 1;
    int len = str1.length();
    while (cnt <= len) {
        str1 = str1.substr(len -1, 1) + str1.substr(0, len -1);
        if (str2 == str1) {
            cout << cnt;
            break;
        }
        cnt++;
    }
    if (cnt > len) cout << "-1";
    return 0;
}