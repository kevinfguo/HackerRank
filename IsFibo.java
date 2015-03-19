/*
Kevin Guo
HackerRank Solution: Is Fibo
https://www.hackerrank.com/challenges/is-fibo
*/
import java.io.*;
import java.util.*;

public class Solution {

    static ArrayList<Long> fibs = new ArrayList<Long>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        fibs.add((long)0);
        fibs.add((long)1);
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line = br.readLine();
        int n = Integer.parseInt(line);
        for (int i = 0; i < n; i++){
            line = br.readLine();
            long temp = Long.parseLong(line);
            if (isFib(temp)){
                System.out.println("IsFibo");
            }else{
                System.out.println("IsNotFibo");
            }
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static boolean isFib(long num){
        if (fibs.get(fibs.size()-1) >= num){
            for (int i = fibs.size()-1; i >= 0; i--){
                if (fibs.get(i) == num){
                    return true;
                }
            }
        }else{
            return getFib(num);
        }
        return false;
    }
    
    public static boolean getFib(long num){
        long newfib;
        while (fibs.get(fibs.size()-1) < num){
            newfib = fibs.get(fibs.size()-1) + fibs.get(fibs.size()-2);
            fibs.add(newfib);
        }
        if (fibs.get(fibs.size()-1) == num){
            return true;
        }
        return false;
    }
}