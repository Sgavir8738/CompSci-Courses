#ifndef MYSTRING_H
#define MYSTRING_H

#pragma once

class myString {
    public:
        myString();
        myString(int newSize, char* string);
        myString(const myString& other);
        ~myString();

        void remove(int index);
        void set(int index, char value);
        void clear();
        void print() const;
        int find(myString value) const;
        bool isEmpty() const;

        char operator[](int index) const;
        bool operator==(const myString& other) const;
        bool operator!=(const myString& other) const;
        const myString operator+(const myString& other);
        void operator=(const myString& other);

        
    private:
        int size;
        char* strArr;
};
#endif