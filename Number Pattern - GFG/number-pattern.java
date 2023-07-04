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
            int N=sc.nextInt();
            Solution ob = new Solution();
            ArrayList<String> res = ob.numberPattern(N);
            for (int i = 0; i < res.size(); i++){
			    System.out.print(res.get(i)+" ");
            }
			System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<String> numberPattern(int N){
        // code here
        ArrayList<String>list = new ArrayList<String>();
        
        StringBuilder sb = new StringBuilder();
        
       for(int i = 1; i<=N; i++)
      {
          for(int j = 1; j<=i; j++){
              sb.append(j);
          }
          for(int j = i-1; j>=1; j--){
              sb.append(j);
          }
          sb.append(" ");
      }
      list.add(sb.toString());
      return list;
    }
}