#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char** argv) {

    const int size(10); //Prevents illegal resizing

    int A1[size]; //Declaration of a one dimensional array

    cout << "Enter numbers to populate an array of size 10" << endl;

    for (int i = 0; i < 10; i++)
    {
	cin >> A1[i];
    }

    cout << A1 << endl;

    for (int i = 0; i < size; i++)
    {
	cout << "A1[" << i << "] is at: " << &A1[i];
	cout << " and has a value of: " << A1[i] << endl;
    }
}
