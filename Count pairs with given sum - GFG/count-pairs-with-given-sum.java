//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        
        
        
        

//User function Template for Java

        // code here
  
        // Arrays.sort(arr);
        
        // //bootforce method in o(n^2)
        //  int count = 0;
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(arr[i]+arr[j]==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        
        
        //  Arrays.sort(arr);
        // int i=0;
        // int j=n-1;
        // int count=0;
        
        // while(i!=j){
        //     if(arr[i]+arr[j]==k){
        //         count++;
        //     }
        //     else if(arr[i]+arr[j]<k){
        //         i++;
        //     }
        //     else if(arr[i]+arr[j]>k){
        //         j--;
        //     }
        // }
        // return count;
        
  
        // int count = 0;
        
        // HashMap<Integer,Integer>map = new HashMap<>();
        
        // for(int i = 0; i<n; i++){
        //     int p = k-arr[i];
            
        //     if(map.containsKey(p)){
        //         count = count+map.get(p);
        //     }
        //     if(map.get(arr[i])==null){
        //         map.put(arr[i],0);
        //     }
        //     map.put(arr[i],map.get(arr[i])+1);
        // }
        // return count;
        
        HashMap<Integer,Integer>map = new HashMap<>();
        int count = 0;
        for(int i =0; i<n; i++){
            int val = k-arr[i];
            
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            if(map.get(arr[i])==null){
                map.put(arr[i],0);
            }
            map.put(arr[i],map.get(arr[i])+1);
        }
        return count;
    }
}
