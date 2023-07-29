//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        
        
    
        
        // ArrayList<Integer>list = new ArrayList<Integer>();
        // ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        
           ArrayList<ArrayList<Integer>>ans = new ArrayList<ArrayList<Integer> >();
        //   Set<ArrayList<Integer>> set=new LinkedHashSet<>();
        for(int i = 0; i<n; i++){
        
            for(int j = i+1; j<n; j++){
                
                int l = j+1;
                int r = n-1;
                
                while(l<r){
                    if(arr[j]+arr[l]+arr[r]+arr[i]==k){
                        ArrayList<Integer>list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);
    
                        l++;
                        r--;
                        if(!ans.contains(list)){
                            ans.add(list);
                        }
                    
                    }
                    else if(arr[j]+arr[l]+arr[r]+arr[i]<k){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
           
        }
     
       
     
        return ans;
    }
}