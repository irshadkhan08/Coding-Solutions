//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);
            
            int K = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.remArray(N,arr,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int remArray(int N, int[] arr, int K) {
        // code here
        int mul = 1;
        
        for(int i = 0; i<N; i++){
            mul = (mul*arr[i])%K;
        }
        return mul;
    }
};