/*
Kevin Guo
HackerRank Solution: Game of Thrones
https://www.hackerrank.com/challenges/game-of-thrones
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

bool checkvalid(int nums[]){
    bool oddflag = false;
    for (int i = 0; i < 26; i++){
        //cout << nums[i];
        if (nums[i] % 2 != 0){
            if (oddflag == false){
                oddflag = true;
            }else{
                return false;
            }
        }
    }
    return true;
}

int main() {
   
    string s;
    cin>>s;
     
    int flag = 0;
    // Assign Flag a value of 0 or 1 depending on whether or not you find what you are looking for, in the given string 
    int occurences[26] = {0};
    for (int i = 0; i < s.length(); i++){
        int j = s.at(i) - 97;
        occurences[j] = occurences[j]+1;
    }
    if (checkvalid(occurences)){
        flag = 1;
    }
    
    if(flag==0)
        cout<<"NO";
    else
        cout<<"YES";
    return 0;
}