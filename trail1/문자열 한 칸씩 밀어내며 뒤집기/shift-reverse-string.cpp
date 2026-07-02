#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    int n;
    cin >> str >> n;
    int len = str.length();

    for (int i = 0; i < n; i++) {
        int q;
        cin >> q;
        if (q == 1){
            str = str.substr(1, len - 1) + str.substr(0, 1);
        }
        else if (q == 2) {
            str = str.substr(len -1, 1) + str.substr(0, len - 1);
        }
        else if (q == 3) {
            string tmp;
            for (int i = len - 1; i >= 0; i--) {
                tmp += str[i];
            }
            str = tmp;
        }
        cout << str<< "\n";
    }
    return 0;
}