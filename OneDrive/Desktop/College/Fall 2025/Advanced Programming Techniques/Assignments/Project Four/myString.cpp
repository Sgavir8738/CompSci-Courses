#include <iostream>
#include "myString.h"

using namespace std;

/*
    Author: Sebastian Gaviria 
    Completion Time: 11/02/25 8:34 PM
    Description: Defines the myString class, which is meant to mimic the functionality of java's String class
*/

myString::myString() // Default Constructor sets the size of an empty array to 0
{
    size = 0;
    stringArr = new char[size];
}

myString::myString(char *arr, int num) // Alternate Constructor sets the size and contents of an array according to input values
{
    size = num;
    stringArr = new char[size];
    for (int i = 0; i < size; i++)
    {
        stringArr[i] = arr[i];
    }
}

myString::~myString() // Deconstructor clears the array
{
   clear();
}

void myString::insert(int index, char value) // Duplicates the array into a new one bigger by one and inserts the new given character at the given index
{
    if (index <= size && index > 0)
    {
    
        size++;
        char* newArr = new char[size];
        for (int i = 0; i < index; i++)
        {
            newArr[i] = stringArr[i];
        }
        newArr[index] = value;
        for (int i = index + 1; i < size; i++)
        {
            newArr[i] = stringArr[i - 1];
        }

        delete[] stringArr;
        stringArr = newArr;
        return;
    }
    cout << "Index out of bounds" << endl;
}

void myString::remove(int index) // Duplicates the array into a new one smaller by one and removes the character at the given index
{
    if (index < size && index >= 0)
    {
        size--;
        char* newArr = new char[size];
        for (int i = 0; i < index; i++)
        {
            newArr[i] = stringArr[i];
        }
        for (int i = index; i < size; i++)
        {
            newArr[i] = stringArr[i + 1];
        }

        delete[] stringArr;
        stringArr = newArr;
        return;
    }
    cout << "Index out of bounds" << endl;
}

char myString::get(int index) // Returns the character found at the given index if in bounds
{
    if (index < size && index >= 0)
    {
        for (int i = 0; i < size; i++)
        {
            if (i == index)
            {
                return stringArr[i];
            }
        }
    }
    cout << "Index out of bounds" << endl;
    return -1;
}

void myString::clear() // Deletes the array pointer, sets it to null, and resets size to 0
{
    delete[] stringArr;
    stringArr = nullptr;
    size = 0;
}

int myString::find(char value) // Returns the index containing the given character if found
{
    for (int i = 0; i < size; i++)
    {
        if (stringArr[i] == value)
        {
            return i;
        }
    }
    cout << "Character not found in string" << endl;
    return -1;
}

bool myString::equals(myString& s) // Compares the length and contents of two strings
{
    if (size != s.size)
    {
        return false;
    }
    for (int i = 0; i < s.size; i++)
    {
        if (stringArr[i] != s.stringArr[i])
        {
            return false;
        }
    }
    return true;
}

void myString::print() // Prints array contents to terminal
{
    cout << "String: ";
    for (int i = 0; i < size; i++)
    {
        cout << stringArr[i];
    }
    cout << endl;
}