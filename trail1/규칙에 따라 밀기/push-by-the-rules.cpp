#include <iostream>
#include <string>
using namespace std;

int main() {
    string str, exct;
    cin >> str >> exct;
    int len = str.length();
    for (int i = 0; i < exct.length(); i++) {
        if (exct[i] == 'L') {
            str = str.substr(1, len - 1) + str.substr(0, 1);
        }
        else if(exct[i] == 'R') {
            str = str.substr(len -1, 1) + str.substr(0, len - 1);
        }
    }
    cout << str;
    return 0;
}