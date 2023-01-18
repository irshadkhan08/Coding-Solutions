//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		
		long l=1,r=x;
		
		while(l<=r){
		    long mid=l+(r-l)/2;
		    long midSq = mid*mid;
		    
		    if(midSq==x)return mid;
		    if(midSq>x)r = mid-1;
		    else l = mid+1;
		}
		
		
		return r;
		
		
		
		
		
		
		
		
		
		
		
	    
	   // long l =1,r=x;
	   // long ans =0;
	    
	   // while(l<=r){
	   //     long mid = l+(r-l)/2;
	   //     long midSq = mid*mid;
	        
	   //     if(midSq==x)return mid;
	   //     if(midSq>x){
	   //         r = mid-1;
	   //     }
	   //     else{
	   //         l = mid+1;
	   //         ans = mid;
	   //     }
	   // }
	   // return ans;
	 }
}
