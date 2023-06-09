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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isNarcissistic(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isNarcissistic(int N){
        // code her
        
        int digit = 0;
        
        int n = N;
        
        while(n!=0){
            n = n/10;
            digit++;
        }
        
        int n1 = N;
        int sum = 0;
        while(n1!=0){
        
            sum = sum+(int)Math.pow(n1%10,digit);
            n1= n1/10;
        }
        
        if(sum==N){
            return 1;
        }
        else{
            return 0;
        }
    }
}