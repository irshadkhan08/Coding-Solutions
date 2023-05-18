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
            int n = Integer.parseInt(S[0]);
            int a = Integer.parseInt(S[1]);
            int d = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            int ans = ob.sum_of_ap(n, a, d);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int sum_of_ap(int n, int a, int d)
    {
        // Code here
        //sum of formulla : n/2[2*a+(n-1)*d]
        
        int res = 0;
        
        res= 2*a+(n-1)*d;
        res = res*n;
        return res/2;
    }
}