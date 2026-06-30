#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;
    int n;
    cin >> n;
    if (n > (int)str.length()) {
        for (int i = (int)str.length() - 1; i >= 0; i--) {
            cout << str[i];
        }
    }
    else {
        for (int i = (int)str.length() - 1; i >= (int)str.length() - n; i--) {
            cout << str[i];
        }
    }
    return 0;
}