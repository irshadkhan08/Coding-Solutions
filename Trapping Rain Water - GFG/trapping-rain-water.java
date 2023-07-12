//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
       
       int left[] = new int[n];
       int right[] = new int[n];
       
       //int k = 0;
       //3,0,0,2,0,4
    // l  3,3,3,3,3,4
    // r  4,4,4,4,4,4


    
       
       
      int max = arr[0];
      left[0] = max;
      for(int i = 1; i<n; i++){
          if(max<arr[i]){
              max = arr[i];
              left[i] = max;
          }
          else{
              left[i] = max;
          }
      }
       
    
      int max1 = arr[n-1];
      right[n-1] = max1;
      
      for(int i= n-2; i>=0; i--){
          if(max1<arr[i]){
              max1 = arr[i];
              right[i] = max1;
          }
          else{
              right[i] = max1;
          }
      }
      
      
      
      long sum = 0;
      for(int i = 0; i<n; i++){
         if(left[i]<right[i]){
             sum = sum+left[i]-arr[i];
         }
         else{
             sum = sum+right[i]-arr[i];
         }
          
      }
      
      return sum;
    } 
}


