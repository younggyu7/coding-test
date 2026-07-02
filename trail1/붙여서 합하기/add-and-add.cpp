#include <iostream>
using namespace std;

int main() {
    string str1, str2;
    cin >> str1 >> str2;
    int a = stoi(str1 + str2);
    int b = stoi(str2 + str1);
    cout << a + b;
    return 0;
}