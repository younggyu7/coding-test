#include <iostream>
#include <string>
using namespace std;

int main() {
    string str1;
    string str2;
    cin >> str1 >> str2;
    string newStr1 = str1 + str2;
    string newStr2 = str2 + str1;
    if (newStr1 == newStr2) cout << "true";
    else cout << "false";
    return 0;
}