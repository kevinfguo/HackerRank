/*
Kevin Guo
HackerRank Solution: Alternating Characters
https://www.hackerrank.com/challenges/alternating-characters
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
    for (int i = 0; i < trials; i++){
        int dels = 0;
        string str;
        cin >> str;
        for (int j = str.length()-1; j > 0 ; j--){
            if (str.at(j) == str.at(j-1)){
                str.erase(j,1);
                dels++;
            }
        }
        cout << dels << endl;
    }
    return 0;
}