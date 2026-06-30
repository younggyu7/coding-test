#include <iostream>
#include <string>
using namespace std;

int main() {
    string str1;
    char str2;
    getline(cin, str1);
    cin >> str2;
    int cnt = 0;
    for (int i = 0 ; i < str1.length(); i++) {
        if (str1[i] == str2) cnt++;
    }
    cout << cnt;
    return 0;
}