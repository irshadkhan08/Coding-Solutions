//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
       
       boolean istrue;
       for(int i = 0; i<n-2; i++){
           for(int j = i+1; j<n-1; j++){
               for(int k = j+1; k<n; k++){
                   int a = arr[i]*arr[i];
                   int b = arr[j]*arr[j];
                   int c = arr[k]*arr[k];
                   
                   if(a+b==c|| a+c==b ||b+c==a){
                      return true;
                   }
                   
                //   if(((int)Math.pow(a,2)+(int)Math.pow(b,2))==(int)Math.pow(c,2)){
                //       continue;
                //   }
                //   else{
                //       return false;
                //   }
               }
           }
       }
        return false;
    }
}