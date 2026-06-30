#include <iostream>
#include <string>

using namespace std;

int main() {
    string str1, str2;
    cin >> str1 >> str2;
    int len = str2.size();
    cout << str1.substr(0, 2) + str2.substr(2, len -2);
    return 0;
}