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
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.getHypotenuse(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getHypotenuse(Long N) {
        // code here
        double a = Math.sqrt(N);
        double ans = a*2;
        return (int)ans;
    }
};