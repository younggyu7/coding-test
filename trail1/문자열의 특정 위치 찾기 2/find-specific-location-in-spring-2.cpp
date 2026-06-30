#include <iostream>
#include <string>

using namespace std;

int main() {
    string arr[] = {"apple", "banana", "grape", "blueberry", "orange"};
    char a;
    cin >> a;
    int cnt = 0;
    int arrSize = sizeof(arr) / sizeof(arr[0]);
    for (int i = 0; i < arrSize; i++) {
        if(arr[i][2] == a || arr[i][3] == a) {
            cout << arr[i] << "\n";
            cnt++;
        }
    }
    cout << cnt;
    return 0;
}