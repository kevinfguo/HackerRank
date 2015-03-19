/*
Kevin Guo
HackerRank Solution: MaximumSubarray
https://www.hackerrank.com/challenges/maxsubarray
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void best(vector<long> vals){
    long sum, bestsum, consum, max;
    bool allneg = true;
    sum = 0; bestsum = 0; consum = 0; max = vals[0];
    for (int i = 0; i < vals.size(); i++){
        if (vals[i] > max){
            max = vals[i];
        }
        if (vals[i] > 0){
            consum += vals[i];
        }
        int val = sum + vals[i];
        if (val > 0){
            allneg = false;
            sum = val;
        }else{
            sum = 0;
        }
        
        if (sum > bestsum){
            bestsum = sum;
        }
    }
    if (allneg){
            bestsum = max;
            consum = max;
        }
    cout << bestsum << " " << consum << endl;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int trials;
    cin >> trials;
    for (int i = 0; i < trials; i++){
        vector<long> trialvals;
        long size;
        long val;
        cin >> size;
        for (long j = 0; j < size; j++){
            cin >> val;
            trialvals.push_back(val);
        }
        best(trialvals);
    }
    return 0;
}