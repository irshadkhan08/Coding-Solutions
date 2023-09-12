//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        int ans = -1;
        HashSet<Character>set = new HashSet<>();
        
        
        int i = 0;
        int j = 0;
        
        while(j<S.length()){
            if(set.contains(S.charAt(j))){
              set.remove(S.charAt(i));
              i++;
            }
            else{
                set.add(S.charAt(j));
                ans = Math.max(ans,j-i+1);
                j++;
            }
        }
       return ans;
      
    }
}