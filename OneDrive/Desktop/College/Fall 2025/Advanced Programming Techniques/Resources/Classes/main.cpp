#include <iostream>
#include "myArray.h"

using namespace std;

int main(int argc, char* argv[]) {

    myArray arr1;
    myArray arr2(5, 10);
    const myArray arr3(arr2);

    cout << "Size of arr1: " << arr1.getSize() << endl;
    cout << "Size of arr2: " << arr2.getSize() << endl;

    cout << "Contents of arr1: ";
    arr1.printArray();
    cout << "Contents of arr2: ";
    arr2.printArray();
    cout << "Contents of arr3: ";
    arr3.printArray();

    arr2.setElement(2, 50);
    cout << "Contents of arr2: ";
    arr2.printArray();
    arr2 * 3;
}