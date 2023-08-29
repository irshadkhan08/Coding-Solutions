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
    int i = s1.length() - 1;
    int j = s2.length() - 1;
    
StringBuilder ans = new StringBuilder();
    while (i >= 0 || j >= 0 || carry > 0) {
        int sum = carry;
        if (i >= 0) {
            sum += s1.charAt(i--) - '0';
        }
        if (j >= 0) {
            sum += s2.charAt(j--) - '0';
        }
        ans.append(sum % 2);
        carry = sum / 2;
    }

    // Reverse the order of characters in the result string
   ans = ans.reverse();




    // StringBuilder ans = new StringBuilder();
    // int carry = 0;
    // int i = s1.length() - 1;
    // int j = s2.length() - 1;

    // while (i >= 0 || j >= 0 || carry > 0) {
    //     int sum = carry;
    //     if (i >= 0) {
    //         sum += s1.charAt(i--) - '0';
    //     }
    //     if (j >= 0) {
    //         sum += s2.charAt(j--) - '0';
    //     }
    //     ans.append(sum % 2);
    //     carry = sum / 2;
    // }
    
    // return ans.reverse().toString();
        // code here
    // BigInteger a = BigInteger(s1,2);
    // // BigInteger b= BigInteger(s1,2);
    // int a = Integer.parseInt(s1,2);
    // int b = Integer.parseInt(s2,2);
    // int c = a+b;
    // return Integer.toBinaryString(c);
    
    // //   String ans ="";
    // //   int carry = 0;
 
    // //   int i = s1.length()-1;
    // //   int j = s2.length()-1;
    // //   while(i>=0 || j>=0){
          
    // //       if(i<0){
    // //           int d= (s2.charAt(j)-'0'+carry);
    // //           ans= (d%2+ans);
    // //         //  ans= ans+d;
    // //           carry = (s2.charAt(j)-'0'+carry)/2;
    // //           j--;
    // //       }
    // //       else if(j<0){
    // //           int d = (s1.charAt(i)-'0'+carry);
    // //           ans = (d%2+ans);
    // //         //  ans= ans+d;
    // //           carry = (s1.charAt(i)-'0'+carry)/2;
    // //           i--;
    // //       }
    // //       else{
    // //           int d = (s1.charAt(i)-'0'+s2.charAt(j)-'0'+carry);
    // //           carry = (s1.charAt(i)-'0'+s2.charAt(j)-'0'+carry)/2;
    // //           ans= (d%2+ans);
    // //         // ans = ans+d;
    // //           i--;
    // //           j--;
    // //       }
    // //   }
     
     String res = new String(ans);
      if(carry==1){
          res = "1"+res;
      }
      int p = 0;
      while(res.charAt(p)=='0'){
          p++;
      }
       
        
      return res.substring(p,res.length());
      
    }
}