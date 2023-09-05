//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    public static void reverse(int arr[],int i, int j){
        
        while(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    }
    static List<Integer> nextPermutation(int n, int arr[]){
        // code here

    int k = -1;
    List<Integer>ans = new ArrayList<>();
    for(int i = n-2; i>=0; i--){
        if(arr[i]<arr[i+1]){
            k =i;
            break;
        }
    }
        
    if(k==-1){
        reverse(arr,0,n-1);
        for(int j = 0; j<n; j++){
            ans.add(arr[j]);
        }
        return ans;
       }
       else{
           for(int j = n-1; j>k; j--){
               if(arr[j]>arr[k]){
                   int temp = arr[j];
                   arr[j] = arr[k];
                   arr[k] = temp;
                   break;
               }
           }
        //   int pre = k;
        //     reverse(arr,k,n-1);
        //     int temp = arr[k-1];
        //     arr[k-1] = arr[pre];
        //     arr[pre] = temp;
       }
    reverse(arr,k+1,n-1);
//   Arrays.sort(arr,k,n);
    for(int j = 0; j<n; j++){
        ans.add(arr[j]);
    }
   return ans;
        
    }
    
}