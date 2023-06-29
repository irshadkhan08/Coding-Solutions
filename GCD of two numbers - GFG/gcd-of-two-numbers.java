//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int A = sc.nextInt();
                    int B = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(A,B));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        // int ans = 0;
        
        // for(int i = 1; i<=Math.min(A,B); i++){
        //     if(A%i==0 && B%i==0){
        //         ans = i;
        //     }
        // }
        // return ans;
        
        if(A%B==0){
            return B;
        }
        return gcd(B,A%B);
    } 
}