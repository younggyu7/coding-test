#include <iostream>
#include <string>
using namespace std;

int main() {
    string A;
    cin >> A;

    string newStr;
    int pos = 0;
    int len = A.size();

    while (pos < len) {
        char current = A[pos];
        int cnt = 0;

        while (pos < len && A[pos] == current) {
            cnt++;
            pos++;
        }

        newStr += current;
        newStr += to_string(cnt);
    }

    cout << newStr.size() << '\n';
    cout << newStr;

    return 0;
}