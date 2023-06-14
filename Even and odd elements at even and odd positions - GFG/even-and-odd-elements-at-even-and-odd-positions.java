//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    ArrayList<Long> arrangeOddAndEven(long a[], int n)
    {
        ArrayList<Long>ans = new ArrayList<>();
        ArrayList<Long>even = new ArrayList<>();
        ArrayList<Long>odd = new ArrayList<>();
        
        for(int i = 0;i<n; i++)
         {
             if(a[i]%2==0){
                even .add(a[i]);
            }
            else{
                odd .add(a[i]);
             }
         }
         int i = 0, j =0;
         
         while(i<even.size() && j<odd.size()){
             ans.add(even.get(i++));
             ans.add(odd.get(j++));
         }
        while(i<even.size()){
             ans.add(even.get(i++));
         }
         while(j<odd.size()){
             ans.add(odd.get(j++));
         }
       return ans;
    }
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[m];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            ArrayList<Long> ans=ob.arrangeOddAndEven(a,n);
            for (int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();

        }
    }
}




// } Driver Code Ends