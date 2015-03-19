/*
Kevin Guo
HackerRank Solution: Manasa and Stones
https://www.hackerrank.com/challenges/manasa-and-stones
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
        int T = Integer.parseInt(s);
        while ((s = in.readLine()) != null/* && s.length() != 0*/){
            ArrayList<Long> reslist = new ArrayList<Long>();
            int n = Integer.parseInt(s);
            s = in.readLine();
            int a = Integer.parseInt(s);
            s = in.readLine();
            int b = Integer.parseInt(s);
            for (int i = 0; i < n; i++){
                reslist.add((long)(a*i)+(b*(n-i-1)));
            }
            Collections.sort(reslist);
            long previous = -1;
            for (long res: reslist){
                if (previous != res){
                    System.out.print(res + " ");
                }
                previous = res;
            }
            System.out.println();
        }
    }
}