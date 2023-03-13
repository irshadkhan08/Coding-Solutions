//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.checkFibonacci(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String checkFibonacci(int n){
        // code here
        
        if(n==0||n==1){
            return "Yes";
        }
        else{
            int a = 0,b=1,c;
            while(true){
                c=a+b;
                a=b;
                b=c;
                if(c==n){
                    return "Yes";
                }else if(c>=n){
                    return "No";
                }
            }
        }
        
    }
}
