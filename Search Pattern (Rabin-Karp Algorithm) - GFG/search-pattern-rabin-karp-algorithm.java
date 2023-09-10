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
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution
{
    public final static int d=256;
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        int q=101;
        ArrayList<Integer> ar=new ArrayList<>();
        int M = pat.length();
        int N = S.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;
 
        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;
 
        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + S.charAt(i)) % q;
        }
 
        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) {
            if (p == t) {
                for (j = 0; j < M; j++) {
                    if (S.charAt(i + j) != pat.charAt(j))
                        break;
                }
 
                // if p == t and pat[0...M-1] = txt[i, i+1,
                // ...i+M-1]
                if (j == M)
                    ar.add(i+1);
            }
 
            // Calculate hash value for next window of text:
            // Remove leading digit, add trailing digit
            if (i < N - M) {
                t = (d * (t - S.charAt(i) * h) + S.charAt(i + M)) % q;
 
                if (t < 0)
                    t = (t + q);
            }
        }
        if(!ar.isEmpty()) return ar;
        ar.add(-1);
        return ar;

    }
}