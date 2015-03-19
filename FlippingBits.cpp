/*
Kevin Guo
HackerRank Solution: Flipping Bits
https://www.hackerrank.com/challenges/flipping-bits
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t;
    unsigned int a;
    cin >> t;
    for (int i = 0; i < t; i++){
        cin >> a;
        cout << ~a << "\n";
    }
    return 0;
}
