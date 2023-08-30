//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().removals(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int removals(int[] arr, int n, int k) {
        // code here
       
      
        int i = 0;
        int j = 0;
        int ans = 1;
        Arrays.sort(arr);
     
        if(n==2){
         if(arr[1]-arr[0]<=k){
            return 1;
         }
        }
        else{
      
        while(j<n){
            int max = arr[j];
            int min = arr[i];
            int res = max-min;
            if(res<=k){
                j++;
            }
            else{
                i++;
            }
            ans = Math.max(ans,j-i);
        }
        }
        return n-ans;
    }
}