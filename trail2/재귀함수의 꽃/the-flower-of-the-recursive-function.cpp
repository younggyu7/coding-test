#include <iostream>

using namespace std;

void Printer(int n) {
    if (n == 0) return;
    cout << n << " ";
    Printer(n - 1);
    cout << n << " ";
}
int N;

int main() {
    cin >> N;

    Printer(N);

    return 0;
}