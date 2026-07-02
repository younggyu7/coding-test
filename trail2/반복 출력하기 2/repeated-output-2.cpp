#include <iostream>

using namespace std;

int N;
void Printer(int n) {
    if (n == 0) return;
    Printer(n - 1);
    cout << "HelloWorld\n";
}
int main() {
    cin >> N;

    Printer(N);

    return 0;
}