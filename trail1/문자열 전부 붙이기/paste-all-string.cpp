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
    cout <<str;
    return 0;
}