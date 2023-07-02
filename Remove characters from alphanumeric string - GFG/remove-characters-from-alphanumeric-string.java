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
         
         // this is first method : 01
        // String str = "";
        // for(int i = 0; i<S.length(); i++){
        //     char ch = S.charAt(i);
        //     if(ch>='0' && ch<='9'){
        //         str = str+ch;
        //     }
        // }
        // return str;
        
        // this is second method : 02
        // String str = "";
        // for(int i = 0; i<S.length(); i++){
        //     char ch = S.charAt(i);
            
        //     if(!((ch>=65 && ch<=90) ||(ch>=97 && ch<=122))){
        //         str+=ch;
        //     }
        // }
        // return str;
        
        
        // this is third method : 03
        
        // String str = "";
        // for(int i = 0; i<S.length(); i++){
        //     char ch = S.charAt(i);
            
        //     if(ch>=48 && ch<=57){
        //         str+=ch;
        //     }
        // }
        // return str;
        
        
        // this is fourth method : 04
        
        String str = S.replaceAll("[a-z]","");
        String str1 = str.replaceAll("[A-Z]","");
        return str1;
        
        
    }
}