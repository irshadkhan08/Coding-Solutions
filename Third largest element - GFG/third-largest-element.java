//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int fl = -1;
	    int sl = -1;
	    int tl = -1;
	    
	    Arrays.sort(a);
	    
	   // for(int i = 0; i<n; i++){
	   //     if(fl>a[i]){
	   //         tl = fl;
	   //         sl = tl;
	   //         fl = a[i];
	   //     }
	   //     else if(tl>a[i] &&sl!=a[i]){
	   //     tl = a[i];
	   //     }
	   // }
	    
	   if(n<3){
	       return -1;
	   }
	   else{
	       return a[n-3];
	   }
    }
}
