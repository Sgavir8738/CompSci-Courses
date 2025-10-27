#include <iostream>

using namespace std;

int main(int argc, char* argv[]) {

    string first;
    string last;
    int year;
    string studentClass;

    cout << "Enter your first name: ";
    cin >> first;

    cout << "Enter your last name: ";
    cin >> last;

    cout << "How many years have you been at USC? ";
    cin >> year;

    switch (year) {
        case 1:
            studentClass = "Freshman";
            break;
        case 2:
            studentClass = "Sophomore";
            break;
        case 3:
            studentClass = "Junior";
            break;
        case 4:
            studentClass = "Senior";
            break;
        default:
            studentClass = "Graduate";
    }

    cout << first << " " << last << ", " << studentClass << endl;
}