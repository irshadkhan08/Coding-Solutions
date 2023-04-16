//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            ob.rotate(matrix);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void  rotate(int[][] matrix)
    {
        //first method optimal solution
        
        //------> step1 :column interchange and row fix
        
        int n = matrix.length;
        for(int i =0; i<n;i++){
            
            int l = 0;
            int r = n-1;
            
            while(l<=r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
        
        //------> step2 : row interchange and column fix
        
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            
            for(int j = 0; j<n; j++){
                int temp = matrix[low][j];
                matrix[low][j] = matrix[high][j];
                matrix[high][j] = temp;
            }
            low++;
            high--;
        }
        
    
        // code here
        // int n = matrix.length;
        //   int l = 0;
        // int temp[][] = new int[n][n];
        
        // for(int i = n-1; i>=0; --i){
          
        //     int k = 0;
        //     for(int j = n-1; j>=0; --j){
        //         temp[l][k++] = matrix[i][j];
        //     }
        //     l++;
        // }
        
        
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         matrix[i][j] = temp[i][j];
        //     }
        // }
    }
}