//{ Driver Code Starts
// //Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());//testcases
        
        while(t-- > 0)
        {
            //input a number n
            long n = Long.parseLong(read.readLine());
            
            
            // if n is less than equal to zero then 
            //it can't be a power of 2 so we print No
            if(new Solution().isPowerofTwo(n) == true)
              System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
       // int i = 1;
      //long equal =  pow(2,i);
    //   long equal = 1;
      
    //   equal = Math.pow(2,0);
    //   if(equal==n){
    //       return true;
    //   }
    //   else{
    //       return false;
    //   }
    if(n<=0)return false;
    if(n==1)return true;
    if(n%2==1)return false;
   // isPower(n/2);
    return isPowerofTwo(n/2);
    
        
    }
    // public static int pow(int x,int i){
    //     if(x==0)return x;
    //     if(i==0)return 1;
    //     return pow(x,i-1);
    // }
}