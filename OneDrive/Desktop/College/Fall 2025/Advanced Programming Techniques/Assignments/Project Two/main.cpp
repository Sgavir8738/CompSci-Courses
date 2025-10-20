#include <iostream>
#include "myArray.h"

using namespace std;

/*
    Author: Sebastian Gaviria 
*/

int main (int argc, char* argv[]) {

	if (argc != 2)
	{
		cout << "Usage: " << argv[0] << " <Number>" << endl;
		return 0;
	}

	const int size(stoi(argv[1]));
	int arr[size] = {0};

	readData(arr, size);
	bubbleSort(arr, size);
	printData(arr, size);
}
