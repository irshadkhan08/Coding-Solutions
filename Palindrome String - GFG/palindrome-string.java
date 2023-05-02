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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String str) {
        // code here
        int ans = 0;
        
        int l = 0;
        int n = str.length()-1;
        String s = "";
        for(int i = n; i>=0; i--){
            s+=str.charAt(i);
        }
        if(str.equals(s)){
            ans = 1;
        }
        return ans;
    }
};