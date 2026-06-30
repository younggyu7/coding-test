#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    vector<string> str;
    string s;
    while(cin >> s) {
        str.push_back(s);
    }
    int total = 0;
    for (int i = 0; i < str.size(); i++) {
        total += str[i].length();
    }
    cout << total;
    return 0;
}