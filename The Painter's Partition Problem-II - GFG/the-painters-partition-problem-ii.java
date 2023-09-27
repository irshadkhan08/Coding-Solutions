//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

 class Solution{
    static long minTime(int[] arr,int N,int M){
        //code here
         
        long sum = 0;
        
        for(int i = 0; i<N; i++){
            sum = sum+arr[i];
        }
        
        long l = 0;
        long r = sum;
        long ans = -1;
          long mid = l+(r-l)/2;
        while(l<=r){
            // long mid = (l+r)/2;
          
            if(isSafe(arr,mid,M)){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
           mid = l+(r-l)/2;
        }
        return ans;
    }
    public static boolean  isSafe(int arr[],long pages,int M){
        long sum = 0;
        long student = 1;
        for(int i = 0; i<arr.length; i++){
            if(sum+arr[i]<=pages){
              sum = sum+arr[i];
            }
            else{
                student++;
                if(arr[i]>pages||student>M){
                return false;
            }
                sum = arr[i];
            }
        }
        return true;
    }
    
}
