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
            System.out.println(ob.isInRange(N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String isInRange(int N){
        // code here
        
        switch(N){
                case 1:
                return  "one";
                case 2:
                return  "two";
                case 3:
                return  "three";
                case 4:
                return  "four";
                case 5:
                 return  "five";
                case 6:
                 return  "six";
                case 7:
                 return  "seven";
                case 8:
                return  "eight";
                 case 9:
                 return  "nine";
                case 10:
                 return  "ten";
                  default:
                return  "not in range";
        }
    }
}