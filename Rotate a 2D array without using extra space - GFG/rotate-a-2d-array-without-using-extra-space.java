//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * n + j]);
                }
            }

            new Solution().rotateMatrix(arr, n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.print(arr[i][j] + " ");
                }
            }
            out.println();
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    void rotateMatrix(int matrix[][], int n) {
        // code here
        
        
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
    //      int l = 0;
    //   int temp[][] = new int[n][n];
    //     for(int i = n-1; i>=0; i--){
    //          int k = 0;
    //         for(int j = 0; j<n; j++){
    //             //matrix[k][j] = matrix[j][i];
    //               temp[l][k++]= matrix[j][i];
    //         }
    //         l++;
    //         k = 0;
    //     }
        
    //  for(int i = 0; i<n; i++){
    //      for(int j= 0; j<n; j++){
    //          matrix[i][j] = temp[i][j];
    //      }
    // }
}
}