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
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int M; 
            M = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.maxHeight(N, A, M);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxHeight(int n, int[] tree, int k) {
        
      
      int max = 0;
      for(int i = 0;i<n; i++){
          max = Math.max(tree[i],max);
      }
      
      int l = 0;
      int r = max;
      int ans = 0;
      while(l<=r){
          int  machine_height = (l+r)/2;
          if(isPossible(n,tree,k,machine_height)==true){
              ans = machine_height;
              l = machine_height+1;
          }
          else{
              r = machine_height-1;
          }
      }
      return ans;
    }
    public static boolean isPossible(int n, int tree[],int k,int machine_height){
        int sum  = 0;
        for(int i = 0; i<n; i++){
           sum = sum+Math.max(0,tree[i]-machine_height);
           if(sum>=k){
               return true;
           }
        }
        return false;
    }
}
        
