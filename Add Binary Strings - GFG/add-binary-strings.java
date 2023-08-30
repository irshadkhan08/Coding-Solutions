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
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution {
    String addBinary(String s1, String s2) {
  
      int carry = 0;
      StringBuilder ans = new StringBuilder();
      int i = s1.length()-1;
      int j = s2.length()-1;
      while(i>=0 || j>=0){
          
          if(i<0){
              int d= (s2.charAt(j)-'0'+carry);
             
              ans.append(d%2);
            //  ans= ans+d;
              carry = (s2.charAt(j)-'0'+carry)/2;
              j--;
          }
          else if(j<0){
              int d = (s1.charAt(i)-'0'+carry);
              ans.append(d%2);
              carry = (s1.charAt(i)-'0'+carry)/2;
              i--;
          }
          else{
              int d = (s1.charAt(i)-'0'+s2.charAt(j)-'0'+carry);
              carry = (s1.charAt(i)-'0'+s2.charAt(j)-'0'+carry)/2;
              ans.append(d%2);
              i--;
              j--;
          }
      }
        if(carry!=0){
        ans.append("1");
        }
//         String str=ans.reverse().toString();
//       int k=0;
//       while(k< str.length()-1 && str.charAt(k)=='0'){
//               k++;
//       }

// return str.substring(k);
        ans.reverse();
        
        String res = ans.toString();
        
      int idx = 0;
      while(idx<res.length()-1&& res.charAt(idx)=='0')
      {
          idx++;
      }
      return res.substring(idx);
    }
}