//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    
   static boolean solve(int arr[],int n,int ind,int tar){
        
        if(tar<0||ind==n)  return false;
        
         if(tar==0) return true;

        return solve(arr, n, ind+1, tar-arr[ind]) || solve(arr,n, ind+1, tar);
     
    }
    static int equalPartition(int N, int arr[])
    {
        // code here
       // code here

        int sum=0;
        for(int v:arr)
        sum+=v;
        if(sum%2==1) return 0;
        int tar=sum/2;
        return solve(arr, N, 0, tar)==true? 1:0;
    }
}