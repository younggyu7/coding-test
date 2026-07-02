#include <iostream>
using namespace std;

int main() {
    string str1, str2;
    cin >> str1 >> str2;
    int len1 = str1.length();
    int len2 = str2.length();
    int a, b;
    int i = 0;
    while (i < len1 && isdigit(str1[i])) {
        i++;
    }
    a = stoi(str1.substr(0, i));

    i = 0;
    while (i < len2 && isdigit(str2[i])) {
        i++;
    }
    b = stoi(str2.substr(0, i));
    cout << a + b;
    return 0;
}