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
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maximizeSum(a, n, k));
            
        }
	}
}

// } Driver Code Ends




//User function Template for Java


class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here  
        Arrays.sort(a);
        int c = 0;
        
        for(int i = 0; i<n; i++){
            if(a[i]<0 && c<k){
                a[i]= (-1)*a[i];
                c++;
            }
        }
        
        Arrays.sort(a);
        int r = k-c;
            if(r%2==1){
            a[0] = (-1)*a[0];
            }
        
        long sum = 0;
        
        for(int i = 0; i<n; i++){
            sum = sum+a[i];
        }
        
        return sum;
        
    }
}