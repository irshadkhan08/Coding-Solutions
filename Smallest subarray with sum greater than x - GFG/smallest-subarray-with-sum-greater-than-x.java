//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int arr[], int n, int k) {
        // Your code goes here 
       
       int i =0;
       int j = 0;
       int ans = Integer.MAX_VALUE;
       int sum = 0;
       while(i<=j && j<n)
       {
          
          while(sum<=k && j<n){
              sum = sum+arr[j];
              j++;
          }
          while(sum>k && i<j){
              ans = Math.min(ans,j-i);
              sum = sum-arr[i];
              i++;
          }
          
       }
       if(ans==Integer.MAX_VALUE){
           return 0;
       }
       else{
           return ans;
       }
    }
}

