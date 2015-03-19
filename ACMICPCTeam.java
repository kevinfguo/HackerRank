/*
Kevin Guo
HackerRank Solution: ACM ICPC Team
https://www.hackerrank.com/challenges/acm-icpc-team
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
        String[] parts = s.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        BitSet[] ppl = new BitSet[n];
        int num = 0;
        while ((s = in.readLine()) != null/* && s.length() != 0*/){
            ppl[num] = new BitSet(m);
            for (int i = 0; i < s.length(); i++){
                if (Character.getNumericValue(s.charAt(i)) == 1){
                    ppl[num].set(i);
                }
            }
            num++;
        }
        int maxTeams = 0;
        int maxTops = 0;
        for (int i = 0; i < n; i++){
            for (int j = (i+1); j < n; j++){
                int tops = 0;
                for (int k = 0; k < m; k++){
                    if (ppl[i].get(k) | ppl[j].get(k)){
                        tops++;
                    }
                }
                if (maxTops < tops){
                    maxTeams = 1;
                    maxTops = tops;
                } else if (maxTops == tops){
                    maxTeams++;
                }
            }
        }
        System.out.println(maxTops);
        System.out.println(maxTeams);
    }
}