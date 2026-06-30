#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    char tmp1 = str[0];
    char tmp2 = str[1];
    string newStr;
    for (int i = 0; i < str.size(); i++) {
        if (str[i] == tmp1) newStr += tmp2;
        else if (str[i] == tmp2) newStr += tmp1;
        else newStr += str[i];
    }
    cout << newStr;
    return 0;
}