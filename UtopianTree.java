/*
Kevin Guo
HackerRank Solution: Utopian Tree
https://www.hackerrank.com/challenges/utopian-tree
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileline = null;
        try {
			fileline = buffRead.readLine();
            int iter = Integer.parseInt(fileline);
            for (int i = 0; i < iter; i++){
                fileline = buffRead.readLine();
                int cycles = Integer.parseInt(fileline);
                System.out.println(getHeight(cycles));
            }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public static int getHeight(int n){
        int height = 1;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                height = height +1;
            }else{
                height = height *2;
            }
        }
        return height;
    }
}