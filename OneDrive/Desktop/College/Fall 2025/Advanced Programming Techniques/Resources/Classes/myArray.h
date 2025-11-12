#ifndef MYARRAY_H
#define MYARRAY_H

#pragma once

using namespace std;

class myArray 
{
    friend ostream& operator<<(ostream& lhs, const myArray& rhs);
    friend istream& operator>>(istream& lhs, myArray& rhs);

    public:
        myArray();
        myArray(int, int = 0);
        myArray(const myArray&);
        ~myArray();

        int getSize() const;
        void printArray() const;
        void setElement(int, int);
        int getElement(int) const;
        void copyArray(myArray&);
        void operator=(const myArray&);
        bool operator==(const myArray&) const;
        void operator*(const myArray&);
        void operator*(int);

    private:
        int size;
        int* arr;
        void setSize(int);
};

#endif