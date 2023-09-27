//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int N,int M)
    {
        //Your code here
        if(arr.length<M)return -1;
        int sum = 0;
        
        for(int i = 0; i<N; i++){
            sum = sum+arr[i];
        }
        
        int l = 0;
        int r = sum;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            
            if(isSafe(arr,mid,M)){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
    public static boolean  isSafe(int arr[],int pages,int M){
        int sum = 0;
        int student = 1;
        for(int i = 0; i<arr.length; i++){
            sum = sum+arr[i];
            if(sum>pages){
                if(arr[i]>pages){
                return false;
            }
                student++;
                sum = arr[i];
            }
        }
        return M>=student;
    }
};