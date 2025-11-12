#include <iostream>
#include "myArray.h"

using namespace std;

myArray::myArray()
{
    size = 0;
}

myArray::myArray(int newSize, int initValue)
{
    setSize(newSize);
    arr = new int[size];
    for (int i = 0; i < size; i++)
    {
        arr[i] = initValue;
    }
}

myArray::myArray(const myArray& other)
{
    size = other.size;
    arr = new int[size];
    for (int i = 0; i < size; i++)
    {
        arr[i] = other.arr[i];
    }
}

void myArray::setSize(int newSize)
{
    size = newSize;
}

int myArray::getSize() const
{
    return size;
}

int myArray::getElement(int index) const
{
    return arr[index];
}

void myArray::printArray() const
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

ostream& operator<<(ostream& lhs, const myArray& rhs) 
{
    for (int i = 0; i < rhs.getSize(); i++)
    {
        lhs << rhs.getElement(i) << " ";
    }
    lhs << endl;
    return lhs;
}

void myArray::setElement(int index, int value)
{
    arr[index] = value;
}

void myArray::copyArray(myArray& other)
{
    if (this != &other)
    {
        size = other.size;
        for (int i = 0; i < size; i++)
        {
            arr[i] = other.arr[i];
        }
    }
}

void myArray::operator=(const myArray& other)
{

    if (this != &other)
    {
        delete[] arr;
        size = other.size;
        for (int i = 0; i < size; i++)
        {
            arr[i] = other.arr[i];
        }
    }
}

bool myArray::operator==(const myArray& other) const
{
    if (size != other.size)
    {
        return false;
    }
    for (int i = 0; i < size; i++)
    {
        if (arr[i] != other.arr[i])
        {
            return false;
        }
    }
    return true;
}

void myArray::operator*(const myArray& other)
{
    if (size != other.size)
    {
        return;
    }
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] * other.arr[i];
    }
}

void myArray::operator*(int scalar)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] * scalar;
    }
}

myArray::~myArray()
{
    delete[] arr;
}