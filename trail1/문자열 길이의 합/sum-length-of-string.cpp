#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
    int n; 
    cin >> n;

    vector<string> str(n);
    for (int i = 0; i < n; i++) {
        cin >> str[i];
    }

    int cnt = 0;
    int total = 0;

    for (int i = 0; i < n; i++) {
        total += str[i].size();
        if (str[i][0] == 'a') cnt++;
    }
    cout << total <<  " " << cnt;
    return 0;
}