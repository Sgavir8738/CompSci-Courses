#include <iostream>
#include "Array.h"

using namespace std;

int main(int argc, char* argv[]) {

	if (argc != 2)
	{
		cout << "Usage: " << argv[0] << " <Array Size>" << endl;
		return 0;
	}

	int size(stoi(argv[1]));
	double *arr;
	init(arr, size);
	print(arr, size);
	insert(3, 3, arr, size);
	print(arr, size);
	cout << find(5, arr, size) << endl;
	remove(3, arr, size);
	cout << get(size-1, arr, size) << endl;
	print(arr, size);
	clear(arr, size);
}
