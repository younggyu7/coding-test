#include <iostream>
#include <string>
using namespace std;

int main() {
    string s1, s2;
    cin >> s1 >> s2;
    int len_1 = s1.size();
    int len_2 = s2.size();
    int cnt = 0;
    for (int i = 0; i < len_1 - len_2 + 1; i++) {
        bool s_same = true;
        for (int j = 0; j < len_2; j++) {
            if (s1[i + j] != s2[j]) s_same = false;
        }
        if (s_same) cnt++;
    }
    cout << cnt;
    return 0;
}