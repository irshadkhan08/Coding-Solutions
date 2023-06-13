//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrangeArray(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrangeArray(int[] arr, int n) {
        // code here
        int ans[] = new int[n];
        Arrays.sort(arr);
        
        int i = 0;
        int j = n-1;
        int k1 = 0;
        if(j%2==0){
        while(i<j){
            ans[k1++] = arr[i++];
            ans[k1++] = arr[j--];
        }
        ans[k1++] = arr[n/2];
        }
        else{
            while(i<j){
            ans[k1++] = arr[i++];
            ans[k1++] = arr[j--];
        }
        }
        for(int k = 0; k<n; k++){
            arr[k] = ans[k];
        }
    }
}
