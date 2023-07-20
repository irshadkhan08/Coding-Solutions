//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
    
        
        // int ans = 0;
        
        // for(int i = 0; i<n; i++)
        // {
        //     for(int j = n-1; j>i; j--){
        //         if(arr[i]<=arr[j]){
        //             int temp = j-i;
        //             ans = Math.max(ans,temp);
        //             break;
                   
        //         }
        //     }
        // }
        // return ans;
        
        
        
        
        
        int left[] = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n;i++){
            if(arr[i]<min){
                min  = arr[i];
            }
            left[i]=min;
        }
        
        int right[] = new int[n];
        int max = arr[n-1];
        
    
        for(int i = n-1; i>=0; i--){
            if(arr[i]>max){
                max = arr[i];
            }
            right[i] = max;
        }
        
        int i = 0;
        int j = 0;
        int ans = -1;
        while(i<n && j<n){
        
            if(left[i]<=right[j]){
              ans =  Math.max(ans,j-i);
              j++;
            }
            else{
                i++;
            }
        }
  
        return ans;
        
         

    }
}