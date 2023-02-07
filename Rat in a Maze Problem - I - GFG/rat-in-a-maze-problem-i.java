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
        ArrayList<String> paths = new ArrayList<String>();
        if(m[0][0]==0)
            return paths;
        if(m[n-1][n-1]==0)
            return paths;
        String str = "";
        int row = 0;
        int col = 0;
        recur(m, n, paths, str, row, col);
        return paths;
    }
    public static void recur(int[][] m, int n, ArrayList<String> paths, String str, int row, int col)
    {
        if(row == n - 1 && col == n - 1)
        {
            paths.add(str);
            return;
        }
        
        if(row < 0 || row == n || col < 0 || col == n || m[row][col] == 0)
        {
            return;
        }
        
        m[row][col] = 0;
        recur(m, n, paths, str + 'D', row + 1, col);
        recur(m, n, paths, str + 'R', row, col + 1);
        recur(m, n, paths, str + 'U', row - 1, col);
        recur(m, n, paths, str + 'L', row, col - 1);
        m[row][col] = 1;
    }
}