#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;

    string nwstr = "";
    for (int i = 1; i < (int)str.size(); i += 2) {
        nwstr += str[i];
    }
    for (int i = nwstr.size() - 1; i >= 0; i--) {
        cout << nwstr[i];
    }
    return 0;
}