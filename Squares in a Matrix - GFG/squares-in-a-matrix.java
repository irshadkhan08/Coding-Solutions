//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.squaresInMatrix(m,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long squaresInMatrix(int m, int n) {
        // code here
        long sum = 0;
      while(m!=0 && n!=0){
          int ans = m*n;
          m--;
          n--;
          sum = sum+ans;
      }
      return sum;
    }
};