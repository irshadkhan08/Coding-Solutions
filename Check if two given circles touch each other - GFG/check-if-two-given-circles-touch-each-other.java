//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int X1 = Integer.parseInt(S[0]);
            int Y1 = Integer.parseInt(S[1]);
            int R1 = Integer.parseInt(S[2]);
            int X2 = Integer.parseInt(S[3]);
            int Y2 = Integer.parseInt(S[4]);
            int R2 = Integer.parseInt(S[5]);
            Solution ob = new Solution();
            System.out.println(ob.circleTouch(X1, Y1, R1, X2, Y2, R2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    int circleTouch(int x1, int y1, int r1, int x2, int y2, int r2) {
        //Write your code here
        
        
        // there are two formulla 
        // distance of two points = Math.sqrt(Math.pow(x2-x1),2)+Math.pow((y2-y1),2))
        
        //second formulla  (c1c2<=((r1+r2)^2))
        
        int c1c2 = (int)Math.abs((int)Math.pow((x1-x2),2)+(int)Math.pow((y1-y2),2));
        int sum_r1r2 = (r1+r2);
        sum_r1r2 = (int)Math.pow(sum_r1r2,2);
        
        if(c1c2<=sum_r1r2){
            return 1;
        }
        else{
            return 0;
        }
    }
}