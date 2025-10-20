#include <iostream>
#include "myBasicObject.h"

using namespace std;

myBasicObject::myBasicObject()
{
    cout << "myBasicObject Default Constructor Called" << endl;
}

myBasicObject::~myBasicObject()
{
    cout << "myBasicObject Destructor Called" << endl;
}