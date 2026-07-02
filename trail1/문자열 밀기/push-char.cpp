#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    int len = str.length();
    str = str.substr(1, len - 1) + str.substr(0, 1);
    cout << str;
    return 0;
}