//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends




//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here 
       return (Divisor(arr,0,(int)(N-1)));
        
    }
    public static long Divisor(long arr[],int l,int h){
        long count = 0;
        
        if(l<h){
            int mid = l+(h-l)/2;
            count+=Divisor(arr,l,mid);
            count+=Divisor(arr,mid+1,h);
            count+=merge(arr,l,mid,h);
        }
        return count;
        
    }
    public static long merge(long arr[],int l,int mid,int h  ){
        long count =0;
        int i = l;
        int j = mid+1;
        int k =0;
        long ans[] = new long[h-l+1];
        
        while(i<=mid && j<=h){
            
            if(arr[i]<=arr[j]){
               ans[k++] = arr[i++];
            }else{
                ans[k++] = arr[j++];
                count = count+(mid+1-i);
            }
        }
        
        while(i<=mid){
            ans[k++] = arr[i++];
        }
        while(j<=h){
            ans[k++] = arr[j++];
        }
        
         for(k = 0, i=l; k<ans.length; k++,i++){
             arr[i] = ans[k];
        }
        return count;
    }
}