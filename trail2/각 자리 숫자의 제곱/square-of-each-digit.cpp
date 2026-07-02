#include <iostream>
using namespace std;

int Fac(int n) {
    if (n < 10) return n * n;

    return Fac(n / 10) + (n % 10) * (n % 10);
}

int main() {
    int n;
    cin >> n;
    cout << Fac(n);
    return 0;
}