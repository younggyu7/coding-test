#include <iostream>
#include <string>
using namespace std;

int main() {
    int n; 
    cin >> n;

    string str;
    for (int i = 0; i < n; i++) {
        string tmp;
        cin >> tmp;
        str += tmp;
    }
    int pos = 0;
    while(pos < str.length()) {
        for (int i = 0; i < 5; i++) {
            if (pos < str.length()) cout << str[pos];
            else break;
            pos++;
        }
        cout << "\n";
    }

    return 0;
}