#ifndef MYSTRING_H
#define MYSTRING_H

#pragma once

class myString {
    public: 
        myString();
        myString(char*, int);
        ~myString();
        void insert(int, char);
        void remove(int);
        char get(int);
        void clear();
        int find(char);
        bool equals(myString&);
        void print();   
    private:
        int size;
        char *stringArr;
};

#endif