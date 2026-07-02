#include <iostream>
using namespace std;

int main() {
    string str;
    cin >> str;
    string res;
    for (int i = 0; i < str.length(); i++) {
        if (isalpha(str[i])) {
            res += toupper(str[i]);
        }
    }
    cout << res;
    return 0;
}