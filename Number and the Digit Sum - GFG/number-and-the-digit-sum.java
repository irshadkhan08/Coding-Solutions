//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
    		System.out.println (new Sol().numberCount (n, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static long numberCount (long N, long K)
    {
        // your code here
        int count = 0;
        for(long i = 10; i<=N; i++){
              long sum = digitSum(i);
              if(i-sum>=K){
                  count++;
              }
        }
      return count;
        
    }
    public static long digitSum(long n){
        long sum = 0;
        while(n!=0){
            sum = sum+n%10;
            n = n/10;
        }
        return sum;
    }
}