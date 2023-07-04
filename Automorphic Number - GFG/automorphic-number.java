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
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_AutomorphicNumber(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_AutomorphicNumber(int N)
    {
        // Code here
        
        // method no : 01
        // int p = N*N;
        // int cn1 = 0;
        // int n = N;
        // while(n!=0){
        //     cn1++;
        //     n = n/10;
        // }
        // int cn2 =0;
        // int i = 0;
        // int sum = 0;
        // while(p!=0){
        //     if(i<cn1){
        //       // sum = sum*10+p%10;
        //         sum = p%10+sum*10;
        //         i++;
        //     }
        //     p  = p/10;
        //     if(i==cn1){
        //         break;
        //     }
        // }
        
        // int Nsum = 0;
        // while(sum!=0){
        //     Nsum = 10*Nsum+sum%10;
        //     sum = sum/10;
        // }
        // if(Nsum==N){
        //     return "Automorphic";
        // }
        // else{
        //     return "Not Automorphic";
        // }
        
        
        // method no : 02
        
        int sq = N*N;
         int l = (""+N).length();
        // int l = 0;
        // int t = N;
        // while(t!=0){
        //     t = t/10;
        //     l++;
        // }
        int end = (sq%(int)Math.pow(10,l));
        
        if(N==end){
             return "Automorphic";
        }
        else{
             return "Not Automorphic";
        }
    }
}