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
            int ans  = ob.oppositeFaceOfDice(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int oppositeFaceOfDice(int N){
        // code here
      //  return 7-N;
      int ans = 0;
      
      switch(N){
        case 1:
            ans = 6;
            break;
        case 2:
            ans = 5;
            break;
            
        case 3:
            ans = 4;
            break;
        case 4 :
            ans = 3;
            break;
        case 5 :
            ans = 2;
            break;
        case 6 :
            ans =1;
            break;
      }
      return ans;
        
    }
}