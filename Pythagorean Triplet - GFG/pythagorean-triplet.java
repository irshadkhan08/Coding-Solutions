//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
       
       boolean istrue;
    //   for(int i = 0; i<n-2; i++){
    //       for(int j = i+1; j<n-1; j++){
    //           for(int k = j+1; k<n; k++){
    //               int a = arr[i]*arr[i];
    //               int b = arr[j]*arr[j];
    //               int c = arr[k]*arr[k];
                   
    //               if(a+b==c|| a+c==b ||b+c==a){
    //                   return true;
    //               }
    //           }
    //       }
    //   }
    
    
    // for(int i = 0; i<n; i++){
    //     arr[i] = arr[i]*arr[i];
    // }
    
    // int l = 0;
    // int r = n-2;
    // int h = n-1;
    // // Arrays.sort(arr);
    // while(l<=r){
    //     if(arr[l]+arr[r]==arr[h]){
    //         return true;
    //     }
    //     else if(arr[l]+arr[r]<arr[h]){
    //         l++;
    //     }
    //     else{
            
    //         r--;
    //     }
    // }
    //     return false;
    
    
    
    
    Arrays.sort(arr);
    for(int i = 0; i<n; i++){
        arr[i] = arr[i]*arr[i];
    }
    
    for(int i = n-1; i>=0; i--){
        
        int l = 0;
        int r = n-2;
        
        while(l<r){
            if(arr[l]+arr[r]==arr[i]){
                return true;
            }
            else if(arr[l]+arr[r]<arr[i]){
                l++;
            }
            else{
                r--;
            }
        }
        
    }
    
    return false;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}