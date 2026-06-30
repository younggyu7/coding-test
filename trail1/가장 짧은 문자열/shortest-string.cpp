#include <iostream>
#include <string>

using namespace std;

int main() {
    string str1;
    string str2;
    string str3;
    
    cin >> str1 >> str2 >> str3;

    int a = str1.length();
    int b = str2.length();
    int c = str3.length();
    int max_len = max(a, max(b, c));
    int min_len = min(a, min(b, c));
    cout << max_len - min_len;
    return 0;
}