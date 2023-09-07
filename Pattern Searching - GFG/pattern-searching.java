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
            String input[] = read.readLine().split(" ");
            String text = input[0];
            String pattern = input[1];
            Solution ob = new Solution();
            System.out.println(ob.search(text,pattern));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int search(String text, String pat) {
        // code here
        int t = text.length();
        int p = pat.length();
        if(t<p){
            return 0;
        }
        if(text.contains(pat)){
            return 1;
        }
        else{
            return 0;
        }
    }
};