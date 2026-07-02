#include <iostream>
using namespace std;
void Printer1(int n) {
    if (n == 0) return;
    Printer1(n - 1);
    cout << n << " ";
}
void Printer2(int n) {
    if (n == 0) return;
    cout << n << " ";
    Printer2(n - 1);
}
int main() {
    int n;
    cin >> n;
    Printer1(n);
    cout << "\n";
    Printer2(n);
    return 0;
}