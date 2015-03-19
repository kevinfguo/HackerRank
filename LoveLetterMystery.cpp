/*
Kevin Guo
HackerRank Solution: The Love Letter Mystery
https://www.hackerrank.com/challenges/the-love-letter-mystery
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int trials;
    cin >> trials;
    for (int trial = 0; trial < trials; trial++){
        string str;
        cin >> str;
        int piv1, piv2;
        if (str.length() % 2 == 0){
            piv2 = str.length()/2;
            piv1 = piv2-1;
        }else{
            piv2 = str.length()/2 + 1;
            piv1 = str.length()/2 - 1;
        }
        int total = 0;
        for (int i = 0; i < str.length()/2; i++){
            total += abs(str.at(piv2) - str.at(piv1));
            piv2++;
            piv1--;
        }
        cout << total << endl;
    }
    return 0;
}