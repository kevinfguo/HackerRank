/*
Kevin Guo
HackerRank Solution: Angry Children
https://www.hackerrank.com/challenges/angry-children/
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Solution {
   static BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
   static StringBuilder out = new StringBuilder();

   public static void main(String[] args) throws NumberFormatException, IOException {
      int numPackets = Integer.parseInt(in.readLine());
      int numKids = Integer.parseInt(in.readLine());
      int[] packets = new int[numPackets];
      
      for(int i = 0; i < numPackets; i ++)
      {
         packets[i] = Integer.parseInt(in.readLine());
      }
      
      int unfairness = Integer.MAX_VALUE;
       
      Arrays.sort(packets);
      int[] temp = Arrays.copyOfRange(packets, 0, numKids);
      unfairness = temp[numKids-1] - temp[0];
      for (int i = 1; (i + numKids-1) < numPackets; i++){
          temp = Arrays.copyOfRange(packets,i,i+numKids);
          if (unfairness > temp[numKids-1] - temp[0]){
              unfairness = temp[numKids-1] - temp[0];
          }
      }
      
        // Write your code here, to process numPackets N, numKids K, and the packets of candies
      // Compute the ideal value for unfairness over here
      
      System.out.println(unfairness);
   }
}