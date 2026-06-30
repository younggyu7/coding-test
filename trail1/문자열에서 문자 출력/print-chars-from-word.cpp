#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;
    for(auto x : str) {
        cout << x << "\n";
    }
    return 0;
}