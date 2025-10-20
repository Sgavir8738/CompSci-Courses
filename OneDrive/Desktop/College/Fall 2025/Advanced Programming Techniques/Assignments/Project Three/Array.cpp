#include <iostream>

using namespace std;

/*
	Author: Sebastian Gaviria
*/

void init(double *&arr, int size) {
	arr = new double[size];
	for (int i = 0; i < size; i++)
	{
		cin >> arr[i];
	}
}

void print(double *arr, int size) {

	for (int i = 0; i < size; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
}
