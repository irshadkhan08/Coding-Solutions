//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.rotate(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public void rotate(int arr[], int n)
    {
     
     //  first method copy array
    //  int temp[] = new int[n];
    //  n = n-1;
    //  int j = 0;
    //  for(int i = n; i<=n; i++){
    //     temp[j++] = arr[i];
    //  }
    //  for(int i = 0; i<n; i++){
    //      temp[j++] = arr[i];
    //  }
     
    //  for(int i = 0; i<=n; i++){
    //      arr[i] = temp[i];
    //  }
    
    
    //second method using reverse method
     
      n = n-1;
      reverse(n,n,arr);
      reverse(0,n-1,arr);
      reverse(0,n,arr);
    }
    public static void reverse(int l,int h,int arr[]){
        
        while(l<h){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
        l++;
        h--;
        }
    }
}