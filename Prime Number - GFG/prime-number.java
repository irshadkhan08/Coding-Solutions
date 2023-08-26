//{ Driver Code Starts
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
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        // // code here
        // if(N==1){
        //     return 0;
        // }
        // for(int i = 2; i<=Math.sqrt(N); i++){
        //     if(N%i==0){
        //         return 0;
        //     }
        // }
        // return 1;
        
        
        
        //efficient rule
        
        if(N==2)return 1;
        if(N==1||N%2==0)return 0;
        
        for(int i = 3; i*i<=N; i+=2){
            if(N%i==0){
                return 0;
            }
        }
        return 1;
    }
}