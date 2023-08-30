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
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().minRemoval(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    int minRemoval(int arr[], int n) {
        // code here
       int i = 0;
       int j = 0;
       int ans = 0;
       Arrays.sort(arr);
       while(j<n){
           if(2*arr[i]>=arr[j]){
               j++;
           }
           else{
               i++;
           }
           ans = Math.max(ans,j-i);
       }
       return n-ans;
    }
}