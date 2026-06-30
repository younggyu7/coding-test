#include <iostream>
#include <string>

using namespace std;

int main() {
    string arr[10];
    for (int i = 0 ; i < 10; i++) {
        cin >> arr[i];
    }

    char a;
    cin >> a;
    int cnt = 0;
    for (int i = 0; i < 10; i++) {
        int lstWrd = arr[i].size();
        if (arr[i][lstWrd - 1] == a) {
            cout << arr[i] << "\n";
            cnt++;
        }
    }
    if (!cnt) cout << "None";
    return 0;
}