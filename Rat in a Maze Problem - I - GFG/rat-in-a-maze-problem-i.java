//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends

class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<String>();
    
        String str = "";
        if(m[0][0]==0)
           return ans;
        if(m[n-1][n-1]==0)
        return ans;
        int row = 0;
        int col = 0;
        helper(m,n,row,col,str,ans);
        return ans;
    }
    public static void helper(int [][]m,int n,int i,int j,String str, ArrayList<String> ans){
        
          if(i==n-1 && j==n-1){
             ans.add(str);
             return;
           }
        if(i<0||i==n||j<0 ||j==n|| m[i][j]==0){
            return;
        }
        m[i][j] = 0;
        helper(m,n,i+1,j,str+'D',ans);
        helper(m,n,i,j+1,str+'R',ans);
        helper(m,n,i-1,j,str+'U',ans);
        helper(m,n,i,j-1,str+'L',ans);
        m[i][j]=1;
    }
}