//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int candies[]= new int[N];
            for(int i = 0; i < N; i++)
                candies[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> cost = ob.candyStore(candies,N,K);
            System.out.println(cost.get(0)+" "+cost.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int k){
        // code here

        ArrayList<Integer>ans = new ArrayList<>();
        Arrays.sort(candies);
        int min = 0;
        int j = N-1;
        for(int i = 0; i<N&&i<=j; i++){
                min = min+candies[i];
                j = j-k;
        }
        ans.add(min);
        
         int max = 0;
         j = 0;
         for(int i = N-1; i>=0 && i>=j; i--){
                max = max+candies[i];
                j= j+k;
        }
         ans.add(max);
         
         return ans;
    }
}