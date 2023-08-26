//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            obj.print_divisors(n);
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static void print_divisors(int n) {
        // code here
        // ArrayList<Integer>al = new ArrayList<>();
        // for(int i = 1; i*i<=n; i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //         if(n/i!=i){
        //          al.add(i);
        //         }
        //     }
        // }
        // int size = al.size();
        // for(int i = size-1; i>=0; i--){
        //      System.out.print(n/al.get(i)+" ");
        // }
        
        int i = 1;
        for( i = 1; i*i<=n; i++){
            if(n%i==0){
            System.out.print(i+" ");
            }
        }
        for( i = i-1; i>=1; i--){
            if(n%i==0 && n/i!=i){
              System.out.print(n/i+" ");
            }
        }
    }
}
