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
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here\
        ArrayList<String> a = new ArrayList<>();
        String cur = "";
        powerSet(s,0,cur,a);
        Collections.sort(a);
        return a;
    }
    public static void powerSet(String s,int i,String cur,List<String>ans){

         if(i==s.length()){
            if(!(cur=="")){
                ans.add(cur);
            }
        
        
            return;
        }
        powerSet(s,i+1,cur+s.charAt(i),ans);
        powerSet(s,i+1,cur,ans);
        
    }
}