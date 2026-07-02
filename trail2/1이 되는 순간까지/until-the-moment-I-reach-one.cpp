#include <iostream>
using namespace std;

int cnt = 0;
void F(int n) {
    cnt++;
    if (n == 1) {
        return;
    }
    if ( n % 2 == 0) {
        F(n / 2);
    }
    else {
        F( n / 3);
    }
}
int main() {
    int n;
    cin >> n;
    F(n);
    cout << cnt - 1;
    return 0;
}