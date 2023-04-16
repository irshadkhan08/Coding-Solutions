//{ Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            g.rotate(arr);
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        
        
   
       int n = matrix.length;
       
        int l = 0;
       int temp[][] = new int[n][n];
        for(int i = n-1; i>=0; i--){
             int k = 0;
            for(int j = 0; j<n; j++){
                //matrix[k][j] = matrix[j][i];
                  temp[l][k++]= matrix[j][i];
            }
            l++;
            k = 0;
        }
        
     for(int i = 0; i<n; i++){
         for(int j= 0; j<n; j++){
             matrix[i][j] = temp[i][j];
         }
    }
    }
}