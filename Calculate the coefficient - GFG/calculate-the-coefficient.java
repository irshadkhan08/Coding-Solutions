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
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine();
            String[] S = s.split(" ");
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            int ans = ob.permutationCoeff(n,k);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends




//User function Template for Java



class Solution
{
    public int permutationCoeff(int n, int k)
    {
        // Code here
        long ans = 1;
        k = k%n;
        long p=1,M=1000000007;
        for(int i = n; i>n-k; i--){
            ans = ans*i%M;
        }
        // long rem = n-k;
        return (int)(ans);
    }
}