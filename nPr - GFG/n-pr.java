//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            Long n = Long.parseLong(a[0]);
            Long r = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nPr(n, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long nPr(long n, long r){
        // code here
        long f1 = fun1(n);
        long f2 = fun2(n-r);
        long ans = f1/f2;
        return ans;
    }
    public static long fun1(long n){
        if(n==0||n==1){
            return 1;
        }
        return n*fun1(n-1);
    }
    public static long fun2(long n){
        if(n==0||n==1){
            return 1;
        }
        return n*fun1(n-1);
    }
}