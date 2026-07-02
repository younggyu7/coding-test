#include <iostream>
using namespace std;

int main() {
    string str1, str2;
    cin >> str1 >> str2;

    int a = 0;
    int b = 0;

    for (int i = 0; i < str1.length(); i++) {
        if (isdigit(str1[i])) {
            a = a * 10 + (int)(str1[i] -'0');
        }
    }
    for (int i = 0; i < str2.length(); i++) {
        if (isdigit(str2[i])) {
            b = b * 10 + (int)(str2[i] - '0');
        }
    }
    
    cout << a + b;
    return 0;
}