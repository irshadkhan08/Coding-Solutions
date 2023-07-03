//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java




//User function Template for Java




//User function Template for Java


class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
    //     int count = 0;
    //   // Arrays.sort(a);
    //     for(int i = 0; i<n; i++){
    //         long mul = 1;
    //         for(int j= i; j<n; j++){
             
    //             if(mul*a[j]<k){
    //                 mul = a[j]*mul;
    //                 count = count+1;
                   
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }
    //     return count;
    //int count = 0;
        //Arrays.sort(a);
        // for(int i = 0; i<n; i++){
        //     long mul = a[i];
        //     if(mul<k){
        //         count++;
        //     }
            
        //     for(int j= i+1; j<n; j++){
        //       mul = mul*a[j];
        //         if(mul<k){
        //             count = count+1;
                    
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return count;
        
        
        
        
        int count = 0;
        
        for(int i = 0; i<n; i++){
            long mul = 1;
            for(int j= i; j<n; j++){
                mul = mul*a[j];
                if(mul<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}