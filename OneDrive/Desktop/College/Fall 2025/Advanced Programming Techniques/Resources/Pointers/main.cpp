#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {

    int temp;
    double x(10);
    double y(-10);
    double *ptr;

    cout << "x is at: " << &x << " and has a value of: " << x << endl;
    cout << "ptr is at: " << &ptr << " and points to: " << ptr << " and has a value of: " << *ptr << endl;
    cout << endl;

    ptr = &x;
    cout << "x is at: " << &x << " and has a value of: " << x << endl;
    cout << "ptr is at: " << &ptr << " and points to: " << ptr << " and has a value of: " << *ptr << endl;
    cout << endl;

    x = 20;
    cout << "x is at: " << &x << " and has a value of: " << x << endl;
    cout << "ptr is at: " << &ptr << " and points to: " << ptr << " and has a value of: " << *ptr << endl;
    cout << endl;

    *ptr = 30;
    cout << "x is at: " << &x << " and has a value of: " << x << endl;
    cout << "ptr is at: " << &ptr << " and points to: " << ptr << " and has a value of: " << *ptr << endl;
    cout << endl;

    ptr =&y ;
    cout << "x is at: " << &x << " and has a value of: " << x << endl;
    cout << "y is at: " << &y << " and has a value of: " << y << endl;
    cout << "ptr is at: " << &ptr << " and points to: " << ptr << " and has a value of: " << *ptr << endl;
    cout << endl;

    double *ptr2;
    ptr2 = new double;
    *ptr2 = 10;
    cout << "ptr2 is at: " << &ptr2 << " and points to: " << ptr2 <<  " and has a value of: " << *ptr2 << endl;
    cout << endl;

	double *ptr3;
	ptr3 = new double [20];
	for (int i = 0; i < 20; i++)
	{
		ptr3[i] = i;
	}

	delete ptr3;
	ptr3 = new double[6];

    delete ptr;
    delete ptr2;
	delete ptr3;
}

