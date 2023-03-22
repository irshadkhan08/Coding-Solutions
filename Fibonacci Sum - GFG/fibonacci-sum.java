//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static long fibSum(long n){
        //code here
    //   long a = 0;
    //   long b = 1;
    //   long sum = 0;
    //   long c = a+b;
    //   long mod = 1000000007;
    //   if(a==0|| b==1){
    //      sum = c;
    //      return sum;
    //   }
     
    //   for(int i = 2; i<=n; i++){
    //     c = (a+b)%mod;
    //   // sum = sum+c;
    //     a = b;
    //     b = c;
    //     sum = sum+b;
    //   }
    //   return sum;
    
    if(n==0 ||n==1){
        return n;
    }
    long dp[] = new long[(int)n+1];
    dp[0] = 0;
    dp[1] = 1;
     long mod = 1000000007;
    long sum = 0;
    sum = dp[0]+dp[1];
    
    for(int i = 2; i<=n; i++){
        dp[i] = (dp[i-1]+dp[i-2])%mod;
        sum = sum+dp[i];
    }
    return sum%mod;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends