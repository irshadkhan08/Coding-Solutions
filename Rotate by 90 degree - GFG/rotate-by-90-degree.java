//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        
        
        
        //method first without using extra space take o(1)space
        
        
        for(int i = 0; i<n;i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        int l = 0;
        int r = n-1;
        
        while(l<=r){
            for(int j= 0; j<n; j++){
                int temp = matrix[l][j];
                matrix[l][j] = matrix[r][j];
                matrix[r][j] = temp;
            }
            l++;
            r--;
        }
        
        
        // for(int i = 0; i<n/2;i++){
        //     for(int j = 0; j<n; j++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }
        
        
        //method second using extra space take o(n^2) space
    //   int l = 0;
    //   int k = 0;
    //   int temp[][] = new int[n][n];
    //     for(int i = n-1; i>=0; i--){
    //         //k = 0; 
        
    //         for(int j = 0; j<n; j++){
    //             //k = j;
    //             //matrix[k][j] = matrix[j][i];
    //               matrix[l][j]= matrix[j][i];
    //         }
    //         l++;
    //     }
        
    //  for(int i = 0; i<n; i++){
    //      for(int j= 0; j<n; j++){
    //          matrix[i][j] = matrix[i][j];
    //      }
    //  }
    
    }
}