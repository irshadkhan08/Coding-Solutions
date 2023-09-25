//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    public static void main (String[] args)
	{
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            
            int tree[]= new int[n];
            for(int i=0; i<n; i++)
                tree[i] = in.nextInt();
            int k = in.nextInt();
            
            Solution x = new Solution();
            System.out.println( x.find_height(tree,n,k) );
        }
	}
}
// } Driver Code Ends




class Solution
{
    static int find_height(int tree[], int n, int k)
    {
        
        Arrays.sort(tree);
        
 
        
        int l = 0;
        int r = tree[n-1];
        
        while(l<=r){
            int mid = (l+r)/2;
            int collect = 0;
            for(int i = n-1; i>=0; i--){
               
                if(tree[i]-mid<=0){
                   break;
                }
               collect = collect+tree[i]-mid;
               
            }
            
            if(collect==k){
                return mid;
            }
            else if(collect>k){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return -1;
    }
}