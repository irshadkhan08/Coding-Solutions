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
        // while(A!=B){
        //     if(A>B){
        //         A = A-B;
        //     }
        //     else{
        //         B = B-A;
        //     }
        // }
        // return B;
        
        // if(A%B==0){
        //     return B;
        // }
        // return gcd(B,A%B);
        
        if(B==0){
            return A;
        }
        if(A<B){
            return gcd(B,A);
        }
        return gcd(A%B,B);
    
        
        
        
        
        
        
        

    } 
}