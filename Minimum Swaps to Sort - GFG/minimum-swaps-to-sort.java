//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public static void swap(int i , int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int minSwaps(int arr[])
    {
        // Code here
     
       int n = arr.length;
       int ans[] = new int[n];
       int k = 0;
       for(int i = 0; i<n; i++){
           ans[k++] = arr[i];
       }
       Arrays.sort(ans);
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int i = 0; i<n; i++){
           map.put(ans[i],i);
       }
       int count = 0;
    //   int i = 0;
    //   while(i<n){
    for(int i = 0; i<n; i++){
             if(map.get(arr[i])==i){
            //   i++;
            continue;
           }
           else{
               swap(i,map.get(arr[i]),arr);
            //   int temp = arr[map.get(i)];
            //   arr[map.get(i)] =  arr[i];
            //   arr[i] = temp;
              count++;
              i--;
           }
       }
       return count;
       
       
    }
}