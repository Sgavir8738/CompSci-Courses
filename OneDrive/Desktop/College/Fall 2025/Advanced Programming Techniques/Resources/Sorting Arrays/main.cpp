#include "myArray.h"

int main(int argc, char *argv[]) {

    const int size(10);
    int myArray[size] = {0};

    initArray(myArray, size);
    printArray(myArray, size);

    return 0;
}
