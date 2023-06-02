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

            Solution ob = new Solution();
            System.out.println(ob.isDisarium(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isDisarium(int N) {
        // code here
        
        int n = N;
        int rev = 0;
        
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
       
    
        int i = 1;
        int sum = 0;
        
        while(rev!=0){
           int rem = rev%10;
           int ans = (int)Math.pow(rem,i);
            sum = sum+ans;
            rev = rev/10;
            i++;
        }
        if(sum==N){
            return 1;
        }
        else{
            return 0;
        }
    }
};