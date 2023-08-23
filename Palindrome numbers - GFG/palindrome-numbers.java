//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Long t = Long.parseLong(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPallindrome(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long isPallindrome(long N){
        // code here
        
        String str = "";
        
        while(N!=0){
            str+=N%2;
            N = N/2;
        }
        
        int l =0;
        int r = str.length()-1;
        
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return 0;
            }
            l++;
            r--;
        }
        return 1;
    }
}