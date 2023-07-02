//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.delAlternate(S));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        
        
        // this is first method : 01
        // String str = "";

        // for(int i = 0; i<S.length(); i++){
        //     if(i%2==0){
        //         str+=S.charAt(i);
        //     }
        // }
        // return str;
        
        
        
        // this is second method using StringBuffer : 02
        
        // StringBuffer sb = new StringBuffer();
        // for(int i = 0; i<S.length(); i++){
        //   if(i%2==0){
        //       sb.append(S.charAt(i));
        //   }
        // }
        // return sb.toString();
        
        
        
        String str = "";
        for(int i = 0; i<S.length(); i+=2){
            str+=S.charAt(i);
        }
        return str;
    }
}