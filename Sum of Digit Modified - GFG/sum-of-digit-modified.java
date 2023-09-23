//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isMagic(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
   
    int isMagic(int N) {
        // code here
        
      while(N>=10){
        
        int sum = 0;
        int temp = N;
        while(temp!=0){
            sum = sum+temp%10;
            temp = temp/10;
        }
        N = sum;
      }
      if(N==1){
          return 1;
      }
      else{
          return 0;
      }
    }
}