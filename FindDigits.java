/*
Kevin Guo
HackerRank Solution: Find Digits
https://www.hackerrank.com/challenges/find-digits
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        
        try{
        line = br.readLine();
        int n = Integer.parseInt(line);
        
        for (int i = 0; i < n; i++){
            line = br.readLine();
            System.out.println(find(line));
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static int find(String line){
        int total = 0;
        int num = Integer.parseInt(line);
        for (int i = 0; i < line.length(); i++){
            int temp = Character.getNumericValue(line.charAt(i));
            if (temp != 0){
                if (Math.floor(num/temp)*temp == num){
                total++;
            }
            }
            
        }
        return total;
    }
}