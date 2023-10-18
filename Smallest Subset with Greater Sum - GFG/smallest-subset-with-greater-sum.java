//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.Collections;


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int N = sc.nextInt();
            int[] Arr = new int[N];
            for (int i = 0; i < N; ++i){
                Arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            int ans = ob.minSubset(Arr,N);
            System.out.println(ans);
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
    int minSubset(int[] arr,int n) { 
        Arrays.sort(arr);

       long sum=0;

       for(int i=0;i<n;i++)
       {
           sum+=arr[i];
       }

       int count=0;

       long sum2=0;

       for(int i=n-1;i>=0;i--)

       {
           count++;
           sum2+=arr[i];
           sum=sum-arr[i];
           if(sum2>sum)

           {
               break;

           }
       }
       return count;
    }
}