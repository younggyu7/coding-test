#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;
    char a1 = str[0];
    char a2 = str[1];
    for (int i = 0; i < str.size(); i++) {
        if (str[i] == a2) str[i] = a1;
    }
    cout << str;
    return 0;
}