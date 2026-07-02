#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    string target;
    cin >> str >> target;
    size_t pos;
    while((pos = str.find(target)) != string::npos) {
        str.erase(pos, target.length());
    }
    cout << str;
    return 0;
}