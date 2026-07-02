#include <iostream>
using namespace std;

int main() {
    string str;
    while(cin >> str) {
        if (str == "END") break;
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            cout << str[i];
        }
        cout << "\n";
    }
    return 0;
}