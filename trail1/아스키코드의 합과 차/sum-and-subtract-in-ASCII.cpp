#include <iostream>
using namespace std;

int main() {
    char a, b;
    cin >> a >> b;
    int ai = (int) a;
    int bi = (int) b;
    cout << ai + bi << " " << abs(ai - bi);
    return 0;
}