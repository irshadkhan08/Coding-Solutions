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
            int ans = ob.corner_digitSum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int corner_digitSum(int n)
    {
        // code here
        int last = n%10;
        int first = 0;
        int count = 0;
        while(n!=0){
            first = n;
            n = n/10;
            count++;
        }
        if(count==1){
            return first;
        }
        return first+last;
    }
}