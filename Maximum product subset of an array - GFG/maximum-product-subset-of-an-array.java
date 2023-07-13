//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.findMaxProduct(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int findMaxProduct(int n, int[] arr) {
        // code here
       
        
     int zero = 0;
     int negativeMax = Integer.MIN_VALUE;
     long product = 1;
     int negCount = 0;
     int m = 1000000007;
     for(int i =0; i<n; i++){
         if(arr[i]==0){
             zero++;
             continue;
         }
         if(arr[i]<0){
             negCount++;
             negativeMax = Math.max(negativeMax,arr[i]);
         }
         product = ((product%m)*(arr[i]%m))%m;
     }
     
     if(zero==n){
         return 0;
     }
     if(negCount==1 && n==1){
         return (int)product%m;
     }
     if(negCount==1 && negCount+zero==n){
         return 0;
     }
     
     if(negCount%2==1){
         product = (product/negativeMax)%m;
     }
     return (int)product%m;
        
    }
}
        
