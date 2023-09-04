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
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends




//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        
        int n = nums.length;
        int xor = 0;
        for(int i = 0; i<n; i++){
            xor = xor^nums[i];
        }
        
        int res = xor&(~(xor-1));
        int f = 0;
        int s = 0;
        boolean istrue = false;
        for(int i = 0; i<nums.length; i++){
            if((res&nums[i])!=0){
                f = f^nums[i];
            }
            else{
                s = s^nums[i];
            }
        }
        
        int ans[] = new int[2];
        
        ans[0] = Math.min(f,s);
        ans[1]= Math.max(f,s);
        return ans;
    }
}