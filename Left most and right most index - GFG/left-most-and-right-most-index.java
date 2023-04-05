//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long arr[], long x)
    {
        // Your code goes here
        
        long left = -1;
        long right = -1;
        
        int n = arr.length-1;
        
        left = left_occur(0,n,arr,x);
        right = right_occur(0,n,arr,x);
        
        return new pair(left,right);
    }
    public static long left_occur(int start,int end,long arr[],long x){
        int l = 0;
        int r = end;
        int first = -1;
        while(l<=r){
            int mid = (l+r)/2;
            
            if(arr[mid]==x){
                first = mid;
                r = mid-1;
            }
            else if(arr[mid]<x){
                l = mid+1;
            }
            else if(arr[mid]>x){
                r = mid-1;
            }
        }
        return (long) first;
    }
    public static long right_occur(int start,int end,long arr[],long x){
         int l = 0;
        int r = end;
        int second = -1;
        while(l<=r){
            int mid = (l+r)/2;
            
            if(arr[mid]==x){
                second = mid;
                l = mid+1;
                
            }
            else if(arr[mid]<x){
                l = mid+1;
            }
            else if(arr[mid]>x){
                r = mid-1;
            }
        }
        return (long) second;
    }
}