#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    while(str.length() > 1) {
        int pos;
        cin >> pos;
        if (pos >= str.length()) str.erase(str.length() - 1, 1);
        else str.erase(pos, 1);
        cout << str << "\n";
    }
    return 0;
}