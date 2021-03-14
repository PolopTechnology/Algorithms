// UnionQuick.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int Union(int id[], int p, int q) {
    id[p - 1] = id[q - 1];
    for (int i = 0; i < sizeof(id) + 1; i++) {
        std::cout << id[i] << ",";
    }
    std::cout << "\n";
    return 0;
}
int main()
{
    int id[] = {1, 2, 3, 4, 5};
    Union(id, 5, 1);
    Union(id, 2, 5);
    Union(id, 3, 1);
    Union(id, 4, 3);
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
