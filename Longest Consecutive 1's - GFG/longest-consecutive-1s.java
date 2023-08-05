//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
        
        int l = 0;
        int n = N;
        
        while(n!=0){
            l++;
            n = n/2;
        }
        
        int arr[] = new int[l];
        int index = 0;
        while(N>0){
            arr[index++] = N%2;
            N = N/2;
        }
        
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
                if(max<count){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        
        return max;
    }
}



//{ Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}



// } Driver Code Ends