#include <iostream>
#include "myString.h"

using namespace std;

/*
    Author: Sebastian Gaviria
    Completion Time: 11/11/25 5:23 PM
    Description: Defines the myString class, introducing operators to be used as well as additional functions to provide greater functionality
*/

myString::myString() // Default Constructor sets size to 0 
{
    size = 0;
}

myString::myString(int newSize, char* string) // Alternate Constructor creates an array from a given size and populates it with a characater array passed to it
{
    size = newSize;
    strArr = new char[size];
    for (int i = 0; i < size; i++)
    {
        strArr[i] = string[i];
    }
}

myString::myString(const myString& other) // Copy Constructor creates an array from a size and array of characters given by another string object
{
    size = other.size;
    strArr = new char[size];
    for (int i = 0; i < size; i++)
    {
        strArr[i] = other.strArr[i];
    }
}

void myString::remove(int index) // Shrinks array size by 1 and creates a new array excluding the character at the given index
{
    if (index < size && index >= 0)
    {
        size--;
        char* newArr = new char[size];
        for (int i = 0; i < index; i++)
        {
            newArr[i] = strArr[i];
        }
        for (int i = index; i < size; i++)
        {
            newArr[i] = strArr[i + 1];
        }

        delete[] strArr;
        strArr = newArr;
        return;
    }
    cout << "Index out of bounds" << endl;
}

void myString::set(int index, char value) // Changes the value at the given index to the new character passed into the function
{
    if (index >= size || index < 0)
    {
        cout << "Index out of bounds" << endl;
        return;
    }
    strArr[index] = value;
}

void myString::clear() // Resets array size, deletes the array, and sets its pointer to a null memory location
{
    delete[] strArr;
    strArr = nullptr;
    size = 0;
}

int myString::find(myString value) const // Determines whether or not a string is found by incrementing through the array
{
    bool found = false;
    for (int i = 0; i < size; i++)
    {
        if (strArr[i] == value[0])
        {
            for (int j = 0; j < value.size; j++)
            {
                if (strArr[i + j] == value[j])
                {
                    found = true;
                }
                else
                {
                    found = false;
                    break;
                }
            }
        }
        if (found)
        {
            return i;
        }
        
    }
    cout << "String not found" << endl;
    return -1;
}


void myString::print() const // Outputs array contents to terminal
{
    cout << "String: ";
    for (int i = 0; i < size; i++)
    {
        cout << strArr[i];
    }
    cout << endl;
}

bool myString::isEmpty() const // Returns whether the size of the array is equal to 0
{
    return size == 0;
}

char myString::operator[](int index) const // Finds the character found at a given index, if within the array
{
    if (index < size && index >= 0)
    {
       return strArr[index];
    }
    cout << "Index out of bounds" << endl;
    return -1;
}


bool myString::operator==(const myString& other) const // Determines the equality of two string objects
{
    if (size != other.size)
    {
        return false;
    }
    for (int i = 0; i < size; i++)
    {
        if (strArr[i] != other.strArr[i])
        {
            return false;
        }
    }
    return true;
}


bool myString::operator!=(const myString& other) const // Determines the inequality of two string objects
{
    if (size != other.size)
    {
        return true;
    }
    for (int i = 0; i < size; i++)
    {
        if (strArr[i] != other.strArr[i])
        {
            return true;
        }
    }
    return false;
}

const myString myString::operator+(const myString& other) // Appends the contents of one object to another
{
    int newSize = size + other.size;
    char* newArr = new char[newSize];
    for (int i = 0; i < size; i++)
    {
        newArr[i] = strArr[i];
    }
    for (int i = size; i < newSize; i++)
    {
        newArr[i] = other.strArr[i-size];
    }
    myString result(newSize, newArr);
    delete[] newArr;
    return result;
}

void myString::operator=(const myString& other) // Define an object as that of another passed into the function
{
    if (this != &other)
    {
        delete[] strArr;
        size = other.size;
        char* newArr = new char[size];
        
        for (int i = 0; i < size; i++)
        {
            newArr[i] = other.strArr[i];
        }
        strArr = newArr;
    }
}

myString::~myString() // Deconstructor deletes the array
{
    delete[] strArr;
}