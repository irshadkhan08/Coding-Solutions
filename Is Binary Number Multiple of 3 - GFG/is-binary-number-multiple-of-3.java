//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine().trim());
            while(t-->0)
                {
                    String s = in.readLine().trim();
                    Solution ob = new Solution();
                    out.println(ob.isDivisible(s));
                }
                out.close();
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isDivisible(String s) {
        // code here
        
    //  int x = 1;
    //  int sum = 0;
    //  for(int i = s.length()-1; i>=0; i--){
    //      if(s.charAt(i)=='1'){
    //          sum = (sum+x)%3;
    //      }
    //      x = (x*2)%3;
    //  }
    //  if(sum==0){
    //      return 1;
    //  }
    //  else{
    //      return 0;                      
    //  }
    
    
    //even odd rule
    
    // int odd = 0;
    // int even = 0;
    
    // for(int i = 0; i<s.length(); i++){
    //     if(s.charAt(i)=='1'){
    //         if(i%2==0){
    //             even++;
    //         }
    //         else{
    //             odd++;
    //         }
    //     }
        
    // }
    
    // if(Math.abs(odd-even)%3==0){
    //     return 1;
    // }
    // else{
    //     return 0;
    // }
    
    
    int odd = 0;
    int even = 0;
    
    for(int i = 0; i<s.length(); i++){
        int bit = s.charAt(i)-'0';
        if(i%2==0){
            odd = odd+bit;
        }
        else{
             even = even+bit;
        }
    }
    int d = Math.abs(even-odd);
    if(d%3==0){
        return 1;
    }
    else{
        return 0;
    }
    
     
    }
}