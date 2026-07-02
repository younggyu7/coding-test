#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    int n;
    cin >> str >> n;
    for (int i = 0; i < n; i++) {
        int qust;
        cin >> qust;
        if (qust == 1) {
            int a, b;
            cin >>a >> b;
            char tmp;
            tmp = str[a - 1];
            str[a - 1] = str[b - 1];
            str[b - 1] = tmp;
        }
        if (qust == 2) {
            char x , y;
            cin >> x >> y;
            for (int i = 0; i < str.size(); i++) {
                if(str[i] == x) str[i] = y;
            }
        }
        cout << str << "\n";
    }
    return 0;
}