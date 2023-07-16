//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        
        
        long ans = arr[0];
        long max = ans;
        long min = ans;
        for(int i = 1; i<n; i++){
            

           if(arr[i]<0){
               long temp = max;
               max = min;
               min = temp;
           }
           max = Math.max(arr[i],max*arr[i]);
           min = Math.min(arr[i],min*arr[i]);
           
           ans = Math.max(ans,max);
            
        }
        return ans;
    //     long ans = Long.MIN_VALUE;
        
    //     int zero = 0;
    //  int negativeMax = Integer.MIN_VALUE;
    //  int negtiveMaxIn= Integer.MIN_VALUE;
    //  int negCountIn = 0;
     
     
    //  long product = 1;
    //  int negCount = 0;
    //  int m = 1000000007;
    //  for(int i =0; i<n; i++){
    //      if(arr[i]==0){
    //          zero++;
    //          product = 1;
    //          continue;
    //      }
    //      if(arr[i]<0){
            
    //          negCountIn++;
    //          negtiveMaxIn = Math.max(negtiveMaxIn,arr[i]);
             
    //          negCount++;
    //          negativeMax = Math.max(negativeMax,arr[i]);
             
    //      }
         
    //      product = ((product%m)*(arr[i]%m))%m;
    //      if(negCountIn%2==1){
    //          product = product/negtiveMaxIn;
    //          negCountIn = Integer.MIN_VALUE;
    //          negCountIn = 0;
    //           if(product>ans){
    //              ans = product;
    //          }
             
    //      }
    //      else{
    //          if(ans<product){
    //                 ans = product;
    //          }
          
    //      }
        
    //  }
     
    //  if(zero==n){
    //      return 0;
    //  }
    //  if(negCount==1 && n==1){
    //      return (int)negativeMax%m;
    //  }
    //  if(negCount==1 && negCount+zero==n){
    //      return 0;
    //  }
     
    //  return (int)ans%m;
        
    }
}