#include <iostream>

using namespace std;

/*
    Author: Sebastian Gaviria 
*/

void readData(int arr[], int size) {

	cout << "Enter any " << size << " numbers: ";
	for (int i = 0; i < size; i++)
	{
		cin >> arr[i];
	}
}

void bubbleSort(int arr[], int size) {

	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < size; j++)
		{
			if (arr[j] > arr[i])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				continue;
			}
		}
	}
}

void printData(int arr[], int size) {

	for (int i = 0; i < size; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
}

