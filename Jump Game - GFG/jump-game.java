//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.canReach(A,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int canReach(int[] arr, int n) {
        // code here
        
        int pos = 0;
     int jump = 0;
     int des = 0;
     for(int i = 0; i<arr.length-1; i++){
         des = Math.max(des,arr[i]+i);
         
         if(pos==i){
             pos = des;
             jump++;
         }
     }
     if(pos<arr.length-1){
         return 0;
     }
     else{
         return 1;
     }
    }
};