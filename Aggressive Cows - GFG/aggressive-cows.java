//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        
        int l = 0;
        int max = -1;
        
        for(int i= 0; i<n; i++){
            if(max<stalls[i]){
                max = stalls[i];
            }
        }
        int r = max;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            
            if(isSolve(stalls,k,mid)){
                ans = mid;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return ans;
    }
    public static boolean isSolve(int stalls[],int k, int mid){
    
        Arrays.sort(stalls);
        int lastPosition = stalls[0];
        int aggressiveCow = 1;
        for(int i = 0; i<stalls.length; i++){
        if(stalls[i]-lastPosition>=mid){
             aggressiveCow++;
            if(aggressiveCow==k){
                return true;
            }
            lastPosition = stalls[i];
         }
        }
     return false;
    }
}