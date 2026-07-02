#include <iostream>
using namespace std;

int main() {
    string str;
    cin >> str;
    int len = str.length();
    for (int i = 0; i < len; i++) {
        if (str[i] >= 'A' && str[i] <= 'Z') cout << (char) (str[i] - 'A' + 'a');
        if (str[i] >= 'a' && str[i] <= 'z') cout << (char) (str[i] - 'a' + 'A');
    }
    return 0;
}