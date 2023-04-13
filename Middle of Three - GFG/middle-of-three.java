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
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.middle(A,B,C));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int middle(int A, int B, int C){
        //code here
        
        // int a[] = new int[3];
        //  a[0] = A;
        //  a[1] = B;
        //  a[2] = C;
         
        //  Arrays.sort(a);
        //  return a[1];
        
        
    //   if((A>B && C<B) || (C>B && A<B)){
    //       return B;
    //   }
    //   else if((A>C && B<C) ||(B>C && A<C)){
    //       return C;
    //   }
    //   else {
    //       return A;
    //   }
    
    // third method
    
    int min = Math.min(A,Math.min(B,C));
    int max = Math.max(A,Math.max(B,C));
    
    return A+B+C-max-min;
    }
}