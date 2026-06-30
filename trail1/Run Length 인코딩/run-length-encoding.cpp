#include <iostream>
#include <string>

using namespace std;

string A;

int main() {
    cin >> A;
    int pos = 0;
    string newStr;
    while(pos < A.size()) {
        char tmp = A[pos];
        int cnt = 1;
        for (int j = pos + 1; j < A.size(); j++) {
            if (A[j] == tmp) {
                pos = j + 1;
                cnt++;
            }
            else break;
        }
        if (cnt == 1) pos++;
        newStr += (tmp + to_string(cnt));
    }
    cout << newStr.size() << "\n";
    cout << newStr;
    return 0;
}
