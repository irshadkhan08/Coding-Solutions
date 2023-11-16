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
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int ans = ob.countTriplets(nums);
            System.out.println(ans);         
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int countTriplets(int[] nums){
      
      int ans = 0;
      
      for(int i = 1; i<nums.length-1; i++){
          
          int l = i-1;
          int r = i+1;
          int smaller = 0;
          int greater = 0;
          while(l>=0){
              if(nums[l]<nums[i]){
                  smaller++;
              }
              l--;
          }
          
          while(r<nums.length){
              if(nums[i]<nums[r]){
                  greater++;
              }
              r++;
          }
          
          ans = ans+smaller*greater;
      }
      return ans;
    }
}