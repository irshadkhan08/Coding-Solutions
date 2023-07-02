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
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeCharacters(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeCharacters(String S) {
        // code here
    
        // String str = "";
        // for(int i = 0; i<S.length(); i++){
        //     //char ch = S.charAt(i);
        //     if(S.charAt(i)>='0' && S.charAt(i)<='9'){
        //         str = str+S.charAt(i);
        //     }
        // }
        // return str;
        
        
         String ans="";
        for(int i=0;i<S.length();i++) {
            if(S.charAt(i)>='0' && S.charAt(i)<='9') {
                ans+=S.charAt(i);
            }
        }
        return ans;
    }
}