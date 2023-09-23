//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            
            Solution g = new Solution();
            long ans = g.wineSelling(arr,N);
            
            System.out.println(ans);
            T--;
        }
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution {
    long wineSelling(int Arr[],int N){
        // code here
        
        
        
        // Time complextiy : o(n)
        //Space complexity : o(1)
        
        long ans = 0;
        int sum = 0;
        
        for(int i = 0; i<N; i++){
            sum = sum+Arr[i];
            ans = ans+Math.abs(sum);
        }
        
        return ans;
        
        
         // Time complextiy : o(n)
        //Space complexity : o(n)
        
        // long ans[] = new long[N];
        // int sum = 0;
        // int k = 0;
        // for(int i = 0; i<N; i++){
        //     sum = sum+Arr[i];
        //     ans[k++] = sum;
        // }
        
        // long res = 0;
        
        // for(int i = 0; i<ans.length; i++){
        //     res = res+Math.abs(ans[i]);
        // }
        
        // return res;
    }
    
}

//{ Driver Code Starts.
// } Driver Code Ends