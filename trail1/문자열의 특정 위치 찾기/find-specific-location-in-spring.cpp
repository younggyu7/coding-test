#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    char s;
    cin >> str >> s;
    if(str.find(s) != string::npos) cout << str.find(s);
    else cout << "No";
    return 0;
}