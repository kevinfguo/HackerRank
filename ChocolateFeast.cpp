/*
Kevin Guo
HackerRank Solution: Chocolate Feast
https://www.hackerrank.com/challenges/chocolate-feast
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t,n,c,m;
    cin>>t;
    while(t--){
        cin>>n>>c>>m;
        int answer=0;
        // Computer answer
        answer = n/c;
        int wrappers = answer;
        while (wrappers >= m){
            int temp = wrappers/m;
            answer += temp;
            wrappers -= temp*m;
            wrappers += temp;
        }
        
        cout<<answer<<endl;
    }
    return 0;
}