//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String str)
    {
        // your code here
        ArrayList<Integer>ans = new ArrayList<>();
        if(!str.contains(pat)){
            ans.add(-1);
            return ans;
        }
     int n1 = str.length()-1;
       int n2 = pat.length()-1;
       for(int i = 0; i<=n1-n2; i++){
         int j = 0;
          for(; j<pat.length(); j++){
              if(str.charAt(i+j)!=pat.charAt(j)){
                 break; 
              }
          }
          if(j==pat.length()){
              ans.add(i+1);
          }
       }
       return ans;
    }
}