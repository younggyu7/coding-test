#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    int len = str.size();
    int cnt_ee = 0;
    int cnt_eb = 0;
    for (int i = 0; i < len - 1; i++) {
        if(str[i] == 'e' && str[i + 1] == 'e') {
            cnt_ee++;
        }
        if(str[i] == 'e' && str[i + 1] == 'b') {
            cnt_eb++;
        }
    }
    cout << cnt_ee << " " << cnt_eb;
    return 0;
}