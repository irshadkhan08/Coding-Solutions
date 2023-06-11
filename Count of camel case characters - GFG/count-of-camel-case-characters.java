//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countCamelCase (s));
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countCamelCase (String S)
    {
        // your code here      
        int count = 0;
        // for(int i = 0; i<S.length(); i++){
        //     if(S.charAt(i)>='A' && S.charAt(i)<='Z'){
        //         count++;
        //     }
        // }
        
         for(int i = 0; i<S.length(); i++){
            if(S.charAt(i)>=65 && S.charAt(i)<=90){
                count++;
            }
        }
        return count;
    }
}