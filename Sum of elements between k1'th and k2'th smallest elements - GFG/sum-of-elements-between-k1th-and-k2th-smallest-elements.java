//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            StringTokenizer stt = new StringTokenizer(br.readLine());
            long k1 = Long.parseLong(stt.nextToken());
            long k2 = Long.parseLong(stt.nextToken());
            
            Solution obj = new Solution();
            System.out.println( obj.sumBetweenTwoKth(a, n, k1, k2) );
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes here
        Arrays.sort(A);
        
        long n1 = 0;
        long  n2 = 0;
        
        for(int i = 0; i<N; i++){
            if(i==K1-1){
                n1 = A[i];
            }
            if(i==K2-1){
                n2 = A[i];
            }
        }
        long sum = 0;
        
        for(int i = 0; i<N; i++){
            if(n1<A[i] && A[i]<n2){
                sum = sum+A[i];
            }
        }
        return sum;
    }
    
}
