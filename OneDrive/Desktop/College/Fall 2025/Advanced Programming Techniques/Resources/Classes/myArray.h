#ifndef MYARRAY_H
#define MYARRAY_H

#pragma once

class myArray 
{
    public:
        myArray();
        myArray(int, int = 0);
        myArray(const myArray&);
        ~myArray();

        int getSize();
        void printArray();
        void setElement(int, int);
        void copyArray(myArray&);
        void operator=(const myArray&);
        bool operator==(const myArray&);
        void operator*(const myArray&);
        void operator*(int);

    private:
        int size;
        int* arr;
        void setSize(int);
};

#endif