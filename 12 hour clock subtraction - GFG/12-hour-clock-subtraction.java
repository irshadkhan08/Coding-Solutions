//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int num1 = Integer.parseInt(S[0]);
            int num2 = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.subClock(num1,num2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int subClock(int num1, int num2) {
        // code here
        // int sub =num1-num2;
        // if(sub<0){
        //     return (12+sub)%12;
        // }
        // else if(sub<12){
        //     return sub;
        // }
        // else{
        //     return Math.abs(num1-num2)%12;
        // }
        
          int sub = (num1-num2)%12;
        if(sub<0){
            //return Math.abs((12+sub)%12)/2;
            return (sub+12);
        }
        else {
            return sub;
        }
        
    
        
        
        // int sub = 
        
        
        // if(num1>=num2){
        //     return (num1-num2)%12;
        // }
        // else{
        //     int d = num1-num2;
        //     if(d<0){
        //         return (d+12)%12;
        //     }
        //     else{
        //         return 0;
        //     }
        // }
        
        //return (num1-num2)%12;
    }
};