#include <iostream>
using namespace std;

void Printer(int n) {
    if (n == 0) return;
    Printer(n - 1);
    for (int i = 0; i < n; i++) {
        cout << "*";
    }
    cout << "\n";
}
int main() {
    int n;
    cin >> n;
    Printer(n);
    return 0;
}