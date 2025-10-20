#include <iostream>

using namespace std;

void initArray(int arr[], int size) {

    for (int i = 0; i < size; i++)
    {
        arr[i] = i;
    }

}
void printArray(int arr[], int size) {

    for (int i = 0; i < size; i++)
    {
        cout << "Element at index " << i << ": " << arr[i] << endl;
    }

    cout << endl;

}
