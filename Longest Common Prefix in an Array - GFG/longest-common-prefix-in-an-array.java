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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        
        //Time complexity : o(nlong(n))
      
        // Arrays.sort(arr);
        // char a[] = arr[0].toCharArray();
        // char b[] = arr[n-1].toCharArray();
        
        // String ans = "";
        // int i = 0;
        // int j = 0;
        // boolean istrue = false;
        // while(i<a.length && j<b.length){
        //     if(a[i]==b[j]){
        //         istrue = true;
        //         ans = ans+a[i];
        //           i++;
        //           j++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // if(istrue){
        //     return ans;
        // }
        // else{
        //     return "-1";
        // }
        
        
        
        // method :02
        
        String ans = arr[0];
        
        for(int i = 0;i<n-1; i++){
            
            String x = compare(ans,arr[i+1]);
            if(x.equals("")){
                return "-1";
            }
            else{
                ans  = x;
            }
        }
        return ans;
        
    }
    public String compare(String a,String b){
        
        int i = 0;
        int j = 0;
        String res = "";
        while(i<a.length()&& j<b.length()){
            
            if(a.charAt(i)==b.charAt(j)){
                res = res+a.charAt(i);
            }
            else{
                return res;
            }
         
            i++;
            j++;
        }
        
        return res;
    }
    
}