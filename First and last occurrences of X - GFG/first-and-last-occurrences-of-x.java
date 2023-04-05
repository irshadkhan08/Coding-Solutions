//{ Driver Code Starts
//Initial Template for Java

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
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            



// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer>ans = new ArrayList<Integer>();
        
        int left = left_occur(n,arr,x);
        int right = right_occur(n,arr,x);
        
        
        if(arr[left]!=x){
            ans.add(-1);
            return ans;
        }
        else{
            ans.add(left);
            ans.add(right);
            return ans;
        }
    }
    public static int left_occur(int n,int arr[],int x){
        int l = 0;
        int r = n-1;
        int left = 0;
        while(l<=r){
            int mid = (l+r)/2;
            
            if(arr[mid]==x){
                left = mid;
                r = mid-1;
            }
            else if(arr[mid]<x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return left;
    }
    public static int right_occur(int n,int arr[],int x){
        
        int l = 0;
        int r = n-1;
        int right = 0;
        while(l<=r){
            int mid = (l+r)/2;
            
            if(arr[mid]==x){
                right = mid;
                l = mid+1;
            }
            else if(arr[mid]<x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return right;
    }
}
