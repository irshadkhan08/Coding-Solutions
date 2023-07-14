//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.math.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(sc.next());
            
            String s[] = new String[n];
            for(int i=0;i<n;i++)
            {
                s[i] = sc.next();
            }
            Solution T = new Solution();
            System.out.println(T.lcp(s,n));
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String lcp(String s[],int n)
    {
        // Write your code here
        
        Arrays.sort(s);
        char a[] = s[0].toCharArray();
        char b[] = s[s.length-1].toCharArray();
        
        StringBuilder sb= new StringBuilder();
        
     
         for(int i = 0; i<a.length; i++){
             if(a[i]==b[i]){
                 sb.append(a[i]);
             }
             else{
                 break;
             }
         }
        if(sb.length()==0){
            return "-1";
        }
        else{
            return sb.toString();
        }
    }
}
