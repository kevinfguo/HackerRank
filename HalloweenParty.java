/*
Kevin Guo
HackerRank Solution: Halloween Party
https://www.hackerrank.com/challenges/halloween-party
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
    	    double num = Double.parseDouble(s);
            num = num/2;
            long k = (long)(Math.floor(num) * Math.ceil(num));
            System.out.println(k);
        }
    }
}