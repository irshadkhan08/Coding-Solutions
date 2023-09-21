//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a1[], int a2[]) 
    {
        // Your Code Here
      int n1 = a1.length;
        int n2 = a2.length;
        if(n1 > n2) return medianOfArrays(n,m,a2, a1);

        int l = 0, r = n1; // binary search in a1
        while(l <= r) {
            int m1 = (l+r)/2;
            int m2 = (n1+n2+1)/2 - m1;

            // [0...m1-1] left of a1, [m1...n1-1] right of a1
            // [0...m2-1] left of a2, [m2....n2-1] right of a2

            int max1 = m1 == 0 ? Integer.MIN_VALUE : a1[m1-1];
            int max2 = m2 == 0 ? Integer.MIN_VALUE : a2[m2-1];

            int min1 = m1 == n1 ? Integer.MAX_VALUE : a1[m1];
            int min2 = m2 == n2 ? Integer.MAX_VALUE : a2[m2];

            if(max1 <= min2 && max2 <= min1) {
                if((n1+n2)%2 == 0) {
                    return ((double)Math.max(max1, max2) + (double)Math.min(min1, min2))/2;
                } else {
                    return (double)Math.max(max1, max2);
                }
            } else if(max2 > min1) {
                l = m1+1;
            } else {
                r = m1-1;
            }
        }
        return 0.0;
    }
}