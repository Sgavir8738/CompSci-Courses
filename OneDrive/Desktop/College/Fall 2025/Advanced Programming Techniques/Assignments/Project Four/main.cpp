#include <iostream>
#include "myString.h"

using namespace std;

int main(int argc, char* argv[]) {

    char arr[3];
    arr[0] = 'c';
    arr[1] = 'a';
    arr[2] = 't';
    myString str(arr, 3);
    str.insert(2, 's');
    str.print();
    cout << str.get(2) << endl;
    str.remove(2);
    cout << str.find('t') << endl;

    char newArr[3];
    newArr[0] = 'c';
    newArr[1] = 'a';
    newArr[2] = 't';
    myString newStr(newArr, 3);
    cout << str.equals(newStr) << endl;
}