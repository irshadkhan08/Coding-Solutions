//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java
// class Solution {
//     static long isSumPalindrome(long n){
//         // code here
        
//         long ans = n;
//         if(n==reverse(n))
//             return n;
//         int i = 1;
//         while(i<=5){
//             ans = ans+reverse(ans);
//             if(ans==reverse(ans))
//                 return ans;
//             i++;
//         }
//         return -1;
        
//     }
//     public static long reverse(long n){
//         long rev = 0;
//         while(n!=0){
//             rev = rev*10+n%10;
//             n = n/10;
//         }
//         return rev;
//     }
// }


// class Solution {
//     static long isSumPalindrome(long n){
//         // code here
//       long ans = n;
//         if(n==reverse(n))
//             return n;
//         int i=1;
//         while(i<=5){
//             ans = ans + reverse(ans);
//             if(ans==reverse(ans))
//                 return ans;
//             i++;
//         }
//         return -1;
//     }
//     static long reverse(long n){
//         long rev=0;
//         while(n>0){
//             long ld = n%10;
//             rev=rev*10+ld;
//             n=n/10;
//         }
//         return rev;
//     }
// }




class Solution {
    static long isSumPalindrome(long n){
        // code here
       long ans = n;
        if(n==reverse(n))
            return n;
        int i=1;
        while(i<=5){
            ans = ans + reverse(ans);
            if(ans==reverse(ans))
                return ans;
            i++;
        }
        return -1;
    }
    static long reverse(long n){
        long rev=0;
        while(n>0){
            long ld = n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        return rev;
    }
}