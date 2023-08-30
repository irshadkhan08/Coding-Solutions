//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            Solution ob = new Solution();
            int ans = ob.countZeroes(N);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    int countZeroes(int n){
        // code here
      
      int l = 0;
      int r = 5*n;
      
      for(int i = l; i<=r; i++){
          int zero = zeroCount(i);
          if(zero==n){
              return 5;
          }
      }
      return 0;
    }
    public static int zeroCount(int n){
        int count = 0;
        while(n>=5){
            n = n/5;
            count = count+n;
            
        }
        return count;
    }
}
