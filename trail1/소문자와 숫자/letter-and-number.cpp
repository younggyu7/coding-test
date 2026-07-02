#include <iostream>
using namespace std;

int main() {
    string str;
    cin >> str;
    int len = str.length();
    for (int i = 0; i < len; i++) {
        if (isalpha(str[i])) cout << (char)tolower(str[i]);
        if (isdigit(str[i])) cout << str[i];
    }
    return 0;
}