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
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeVowels(String S) {
        // code here
        
        
        //this is first method : 01
        // StringBuilder res = new StringBuilder();
        // for(int i = 0; i<S.length(); i++){
            
        //     if((S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')){
        //       continue;
        //     }
        //     else{
        //         res.append(S.charAt(i));
        //     }
        // }
        // return res.toString();
        
     
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            
            if(!vowel(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}