#include <iostream>
#include "myString.h"

using namespace std;

int main(int argc, char* argv[]) {

    char* catStr = new char[3];
    catStr[0] = 'c';
    catStr[1] = 'a';
    catStr[2] = 't';
    myString cat = myString(3, catStr);
    delete[] catStr;

    char* dogStr = new char[3];
    dogStr[0] = 'd';
    dogStr[1] = 'o';
    dogStr[2] = 'g'; 
    myString dog = myString(3, dogStr);
    delete[] dogStr;

    myString catdog = cat + dog;
    catdog.print();

    /* 
        cat.print();
        cat = dog;
        cat.print();
    */

    if (cat != dog)
    {
        cout << "true" << endl;
    }
    else
    {
        cout << "false" << endl;
    }

    cout << cat[2] << endl;;
    
    cat.set(2, 'n');
    cat.print();

    cat.remove(2);
    cat.print();

    cat.clear();
    cat.print();
    
    cat = myString(dog);
    cat.print();

    cout << cat.isEmpty() << endl;

    cout << catdog.find(dog) << endl;
    
}