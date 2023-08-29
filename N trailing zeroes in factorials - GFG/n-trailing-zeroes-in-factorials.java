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
      
      while(l<=r){
          int mid = (l+r)/2;
          int zero = countZero(mid);
          if(zero==n){
              return 5;
          }
          else if(zero<n){
             l = mid+1;
          }
          else {
              r = mid-1;
          }
      }
      return 0;
    }
    public static int countZero(int n){
        int count = 0;
        while(n>=5){
            n = n/5;
            count = count+n;
        }
        return count;
    }
}
