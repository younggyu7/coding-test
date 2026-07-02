#include <iostream>
using namespace std;

int main() {
    string str;
    cin >> str;
    int len = str.length();
    int total = 0;
    for (int i = 0; i < len; i++) {
        if (isdigit(str[i])) {
            total += (int) (str[i] - '0');
        }
    }
    cout << total;
    return 0;
}