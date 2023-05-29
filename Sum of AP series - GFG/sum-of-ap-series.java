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
            String s = br.readLine();
            String[] S = s.split(" ");
            long n = Long.parseLong(S[0]);
            Long a = Long.parseLong(S[1]);
            Long d = Long.parseLong(S[2]);
            Solution ob = new Solution();
            Long ans = ob.sum_of_ap(n, a, d);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_ap(long n, long a, long d)
    {
        // Code here
        
        //This is first approach soln in O(n)
        // long sum = 0;
        // for(int i = 1; i<=n; i++){
        //     sum = sum+(a+(i-1)*d);
        // }
        // return sum;
        
        
        
        //optimaztion approach
        //in o(1)
        
        return (n*(2*a+(n-1)*d))/2;
    }
}