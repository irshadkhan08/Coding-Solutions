//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] arr1, int[] arr2, int n) {
        // code here
        
        int temp[] = new int[2*n];
        int k = 0;
        for(int i = 0; i<n; i++){
            temp[k++] = arr1[i];
        }
         for(int i = 0; i<n; i++){
            temp[k++] = arr2[i];
        }
        
        Arrays.sort(temp);
        int n1 = temp.length;
        return temp[n1/2]+temp[n1/2-1];
        
    }
}