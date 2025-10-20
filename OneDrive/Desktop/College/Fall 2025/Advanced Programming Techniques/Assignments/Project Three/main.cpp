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
	delete [] arr;
}
