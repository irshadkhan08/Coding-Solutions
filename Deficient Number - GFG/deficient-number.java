//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long x = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isDeficient(x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isDeficient(long x){
        // code here
        
        long divisorSum = 0;
        
        for(int i = 1; i<=x; i++){
            if(x%i==0){
                divisorSum =  divisorSum+i;
            }
        }
        if(divisorSum<2*x){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}