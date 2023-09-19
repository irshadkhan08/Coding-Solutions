//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int arr[], int key)
	{
	    // code here
	    
	   int l = 0;
	   int r = arr.length-1;
	   
	   while(l<=r){
	       
	       int mid = (l+r)/2;
	       
	       if(arr[mid]==key){
	           return mid;
	       }
	       else if(arr[l]<arr[mid]){
	           
	           if(arr[l]<=key && arr[mid]>key){
	               r = mid-1;
	           }
	           else{
	               l = mid+1;
	           }
	       }
	       else{
	           if(arr[r]>=key && arr[mid]<key){
	               l = mid+1;
	           }
	           else{
	               r = mid-1;
	           }
	       }
	   }
	   return -1;
	    
	}
} 

