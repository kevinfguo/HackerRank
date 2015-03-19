/*
Kevin Guo
HackerRank Solution: Sherlock and Squares
https://www.hackerrank.com/challenges/sherlock-and-squares
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int t = Integer.parseInt(s);
        while ((s = in.readLine()) != null/* && s.length() != 0*/){
            int nums = 0;
            String[] parts = s.split(" ");
            int top, bottom;
            double cand = Double.parseDouble(parts[1]);
            if (cand == Math.pow(Math.floor(Math.sqrt(cand)),2)){
                top = (int)Math.sqrt(cand);
            }else{
                top = (int)Math.floor(Math.sqrt(cand));
            }
            cand = Double.parseDouble(parts[0]);
            if (cand == Math.pow(Math.floor(Math.sqrt(cand)),2)){
                bottom = (int)Math.sqrt(cand);
            }else{
                bottom = (int)Math.ceil(Math.sqrt(cand));
            }
            nums = top-bottom+1;
            System.out.println(nums);
        }
    }
}