#include <iostream>
#include <stdexcept>

using namespace std;

/*
	Author: Sebastian Gaviria
	Completion Time: 10/22/25 3:21 PM
	Description: Take in an array and populate it with integer values given by the user. Also allows array operations such as value insertion, deletion, and searching

*/

void init(double *&arr, int size) {	// Populate the array with user-input values
	arr = new double[size];
	for (int i = 0; i < size; i++)
	{
		cout << "The value at index " << i << ": ";
		cin >> arr[i];
	}
}


void insert(int index, double num, double *&arr, int &size) { // Add new values to an index within the memory allocated to the array, then expand it by 1

	try {
		if (index > size + 1)
		{
			throw out_of_range("Index out of bounds");
		}
	}
	catch (exception e)
	{
		return;
	}

	size++;
	double* newArr = new double[size];
	for (int i = 0; i < index; i++)
	{
		newArr[i] = arr[i];
	}
	newArr[index] = num;
	for (int i = index + 1; i < size; i++)
	{
		newArr[i] = arr[i - 1];
	}

	delete[] arr;
	arr = newArr;
}

void remove(int index, double *&arr, int &size) // Remove value at an index given within the memory allocated to the array, then shrinks it by 1
{
	try {
		if (index >= size)
		{
			throw out_of_range("Index out of bounds");
		}
	}
	catch (exception e)	
	{
		return;
	}

	size--;
	double* newArr = new double[size];
	for (int i = 0; i < index; i++)
	{
		newArr[i] = arr[i];
	}
	for (int i = index; i < size; i++)
	{
		newArr[i] = arr[i + 1];
	}

	delete[] arr;
	arr = newArr;
}

void print(double *arr, int size) {	// Returns the values of the array

	for (int i = 0; i < size; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
}

void clear(double *&arr, int &size) {	// Deletes the contents of the array and resets it's size to 0

	delete[] arr;
	size = 0;
	
}
int get(int index, double *arr, int size) {	// Returns the value at the specified index of the array
	
	try {
		if (index >= size)
		{
			throw out_of_range("Index out of bounds");
		}
	}
	catch (exception e)
	{
		return -1;
	}
	return arr[index];
;}

int find(double num, double *arr, int size) {	// Returns the index at which a specified integer value is found

	for (int i = 0; i < size; i++)
	{
		if (arr[i] == num) 
		{
			return i;
		}
	}

	return -1;
}

bool equals(double *arr1, int size1, double *arr2, int size2) {	// Compares two arrays and returns whether they are equal
	
	if (size1 != size2) {
		return false;
	}
	for (int i = 0; i < size1; i++) 
	{
		if (arr1[i] != arr2[i]) {
			return false;
		}
	}
	return true;
}
