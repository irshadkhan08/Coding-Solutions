//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] a, int n, int s) 
    {
        // Your code here
        ArrayList<Integer>list = new ArrayList<Integer>();
        
        int l = 0;
        int r = 0;
        int sum = a[0];
        boolean istrue = false;
        if(s==0){
            list.add(-1);
            return list;
        }
        while(r<n){
            if(sum==s){
                istrue = true;
                break;
            }
            else if(s>sum){
                r++;
                if(r<n){
                sum = sum+a[r];
                }
            }
            else if(sum>s){
                sum = sum-a[l];
                l++;
            }
    
        }
        if(istrue){
            list.add(l+1);
            list.add(r+1);
            return list;
        }
        else{
            list.add(-1);
            return list;
        }
    }
}