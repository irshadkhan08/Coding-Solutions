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
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxVal(a, n));
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxVal(int a[], int n) {
        
     
      
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            // int j = i;
            maxVal = Math.max(maxVal,((a[i]-i)));
            minVal =Math.min(minVal,((a[i]-i)));
        }
        return maxVal-minVal;
    }
}
