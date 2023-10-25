//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long arr[], long n) 
    {
        long prev[] = new long[(int) n];
        int k = 0;
        Stack<Integer>stack = new Stack<>();
        


        for(int i = 0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
               prev[i] = -1;
            }
            else{
                 prev[i] = stack.peek();
            
            }
            stack.push(i);
        }
        stack.clear();
        
        long next[] = new long[(int) n];
        
        for(int i = arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
               next[i] = arr.length;
            }
            else{
                 next[i] = stack.peek();
            
            }
            stack.push(i);
        }

        
        
        long ans = 0;
        
        
        for(int i = 0; i<n; i++){
            ans = Math.max(ans,(next[i]-prev[i]-1)*arr[i]);
        }
        return ans;
    }
}



