#include <cstdlib>
#include <iostream>
#include <cmath>

using namespace std;

void SolveQuadratic(int a, int b, int c, float& x1, float& x2);
void PrintSolution(float x1, float x2);
void GetConstants(int& a, int& b, int& c);
bool CheckSolution(int a, int b, int c);

int main(int argc, char** argv) {

    string choice("s");

    do {
	cout << "Would you like to solve an equation or quit? Type 's' or 'q': ";
	while (!(cin >> choice) || (choice != "s" && choice != "q"))
	{
	    cin.clear();
            cin.ignore(10000, '\n');
	}

	if (choice == "s")
	{
	    int a(0);
	    int b(0);
	    int c(0);
	    float x1(0);
	    float x2(0);

	    GetConstants(a, b, c);
	    if (!CheckSolution(a, b, c))
	    {
		cout << "No real solutions" << endl;
		continue;
	    }
            SolveQuadratic(a, b, c, x1, x2);
	    PrintSolution(x1, x2);
	}
	else if (choice == "q")
	{
	    break;
	}
    }
    while (choice == "s");

    return 0;
}

void SolveQuadratic(int a, int b, int c, float& x1, float& x2) {

    x1 = -b + sqrt(b * b - (4 * a * c)) ;
    x1 /= (2 * a);

    x2 = -b - sqrt(b * b - (4 * a * c));
    x2 /= (2 * a);
}

void PrintSolution(float x1, float x2) {

    cout << "x1 = " << x1 << ", x2 = " << x2 << endl;
}


void GetConstants(int& a, int& b, int& c) {

    cout << "Enter a value for the coefficent a: ";
    while (!(cin >> a) || cin.get() == '.')
    {
	cin.clear();
	cin.ignore(10000, '\n');
    }

    cout << "Enter a value for the coefficent b: ";
    while (!(cin >> b) || cin.get() == '.')
    {
        cin.clear();
        cin.ignore(10000, '\n');
    }

    cout << "Enter a value for the coefficent c: ";
    while (!(cin >> c) || cin.get() == '.')
    {
        cin.clear();
        cin.ignore(10000, '\n');
    }
}

bool CheckSolution(int a, int b, int c) {

    return (b * b - (4 * a * c)) >= 0;
}
