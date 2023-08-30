//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().smallestSumSubarray(arr, n)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int smallestSumSubarray(int arr[], int size)
    {
        // your code here
        int ans = 1;
        
        if(size==1){
            return arr[0];
        }
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum = sum+arr[i];
            if(ans>sum && sum<0){
                ans = sum;
            }
            else if(sum>=0){
                sum = 0;
            }
         }
    
        return ans;
        
    }
}