//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        // code here
       
      
        StringBuilder sum = new StringBuilder();
      int carry = 0;
 
      int i = s1.length()-1;
      int j = s2.length()-1;
     
      while(i>=0 || j>=0){
          int  d = 0;
          if(i>=0){
              d+=s1.charAt(i)-'0';
              i--;
          }
          if(j>=0){
            d+=s2.charAt(j)-'0';
            j--;
          }
           d = d+carry;
           sum.append(d%10);
           carry = d/10;
            
          
      }
      
    if(carry==1){
        sum.append("1");
     }
//       String str=sum.reverse().toString();
//       int idx=0;
//       while(idx< str.length()-1 && str.charAt(idx)=='0'){
//               idx++;
//       }

// return str.substring(idx);

     
      
   
      String ans =sum.reverse().toString();
      
    //  sum.reverse();
      
      int idx = 0;
      while(idx<ans.length()-1 && ans.charAt(idx)=='0'){
          idx++;
      }
      if(idx==ans.length()){
          return "0";
        
      }
      return ans.substring(idx);

    }
}