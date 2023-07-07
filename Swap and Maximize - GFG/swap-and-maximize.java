//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java




class GFG
{
    long maxSum(long arr[] ,int n)
    {
        
        // this is first method : 01
        // Time complexity : o(n) && space complexity : o(n)
        
        // long sum = 0;
        // Arrays.sort(arr);
        // long ans[] = new long[n];
        
        // int k = 0;
        // int l = 0;
        // int r = n-1;
        
        // // rearrange array like as : 1 8 2 4
        // while(l<r){
        //     ans[k++] = arr[l];
        //     ans[k++] = arr[r];
        //     l++;
        //     r--;
        // }
        
        // for(int i = 1; i<n; i++){
        //     sum+=Math.abs((ans[i]-ans[i-1]));
        // }
        // sum = sum+ans[n-1]-ans[0];
        
        // return sum;
        
        
        //This is second method : 02
        
        long sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i<n; i++)
        {
            sum = sum+Math.abs(arr[i]-arr[n-i-1]);
        }
        return sum;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] a2 = line.trim().split("\\s+");
//            int n =Integer.parseInt(a2[0]);
//            int k =Integer.parseInt(a2[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                arr[i]=Long.parseLong(a1[i]);
            }
            GFG ob=new GFG();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.maxSum(arr,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends