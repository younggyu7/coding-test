#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    int len = str.length();
    cout << str << "\n";
    string tmp;
    tmp = str.substr(len - 1, 1) + str.substr(0, len - 1);
    cout << tmp << "\n";
    while (str != tmp) {
        tmp = tmp.substr(len - 1, 1) + tmp.substr(0, len - 1);
        cout << tmp << "\n";
    }
    return 0;
}