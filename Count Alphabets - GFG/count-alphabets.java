//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String S = read.readLine();
            

            Solution ob = new Solution();
            

            
            System.out.println(ob.Count(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int Count(String S)
    {
        // code here
        
        S = S.toLowerCase();
        int count = 0;
        for(char ch : S.toCharArray()){
            if(ch>='a' && ch<='z'){
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }
}