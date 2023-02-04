//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       ArrayList<Integer>ans = new ArrayList<Integer>();
       
       for(int i=0; i<n; i++){
        //   int index = arr[i]%n;
        //   arr[i] = arr[index]+n;
        
        arr[arr[i]%n] = arr[arr[i]%n]+n;
       }
       boolean check = false;
       for(int i = 0; i<n; i++){
           
           if(arr[i]/n>=2){
               ans.add(i);
               check = true;
           }
       }
         if(!check)ans.add(-1);
       return ans;
    }
}
