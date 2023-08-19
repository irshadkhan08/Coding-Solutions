//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.evaluate_exp(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int evaluate_exp(int n)
    {
        // Code here
        // if(n%2!=0){
        //     return -1;
        // }
        // else{
        //     return 1;
        // }
        
        int n1 = n-1;
        int n2 = n+1;
        int p = fib(n1);
        int q = fib(n2);
        int r = fib(n);
         return p*q-r*r;
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2; i<=n; i++){
             c = a+b;
            a = b;
            b = c;
        }
        
        return c;
    }
}