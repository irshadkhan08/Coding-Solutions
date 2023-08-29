class Solution {
    public String addBinary(String s1, String s2) {
String ans ="";
      int carry = 0;
 
      int i = s1.length()-1;
      int j = s2.length()-1;
      while(i>=0 || j>=0){
          
          if(i<0){
              int d= (s2.charAt(j)-'0'+carry);
              ans= (d%2+ans);
            //  ans= ans+d;
              carry = (s2.charAt(j)-'0'+carry)/2;
              j--;
          }
          else if(j<0){
              int d = (s1.charAt(i)-'0'+carry);
              ans = (d%2+ans);
            //  ans= ans+d;
              carry = (s1.charAt(i)-'0'+carry)/2;
              i--;
          }
          else{
              int d = (s1.charAt(i)-'0'+s2.charAt(j)-'0'+carry);
              carry = (s1.charAt(i)-'0'+s2.charAt(j)-'0'+carry)/2;
              ans= (d%2+ans);
            // ans = ans+d;
              i--;
              j--;
          }
      }
        if(carry!=0){
         return "1"+ans;
        }
        else{
            return ans;
        }
        
        // return "1"+ans;
       // return ans.substring(1,ans.length());
    }
}