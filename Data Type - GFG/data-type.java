//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
    
    int a = 0;
    
     if(str.equals("Character")){
        a = 1;
        return a;
    }
    if(str.equals("Integer")){
        a = 4;
        return a;
    }
    else if(str.equals("Long")){
        a = 8;
        return a;
    }
    else if(str.equals("Float")){
        a = 4;
        return a;
    }
    else if(str.equals("Double")){
        a = 8;
        return a;
    }
    return a;
    
    }
}