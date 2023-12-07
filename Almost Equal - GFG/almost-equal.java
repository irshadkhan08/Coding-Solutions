//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s1 = br.readLine().trim();
            String s2 = br.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.countChars(s1, s2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int countChars(String s1, String s2)
    {
        // Code here
        int c1[] = new int[26];
        int c2[] = new int[26];
       
       for(int i = 0; i<s1.length(); i++){
           c1[s1.charAt(i)-'a']++;
       }
       
       for(int i = 0; i<s2.length(); i++){
           c2[s2.charAt(i)-'a']++;
       }
       
       int ans = 0;
       for(int i = 0; i<26; i++){
           int v = Math.abs(c1[i]-c2[i]);
            ans = ans+v;
       }
       return ans;
    }
}