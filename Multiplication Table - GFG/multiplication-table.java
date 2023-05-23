//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.getTable(N);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer>ans = new ArrayList<Integer>();
        
        int i = 1;
        while(i<=10){
            ans.add(N*i);
            i++;
        }
        return ans;
    }
}