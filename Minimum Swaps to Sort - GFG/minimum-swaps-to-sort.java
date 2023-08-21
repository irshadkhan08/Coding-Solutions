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
     public static void swap(int i,int j,int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int minSwaps(int arr[])
    {
        // Code here
       HashMap<Integer,Integer>map = new HashMap<>();

       int numsSort[] = arr.clone();
       Arrays.sort(numsSort);
       for(int i = 0; i<numsSort.length; i++){
           map.put(numsSort[i],i);
       }
        int i = 0;
        int n = arr.length;
        int count = 0;
        while(i<n){
           if(map.get(arr[i])==i){
               i++;
           }
           else{
                swap(map.get(arr[i]),i,arr);
                count++;
             
           }
       }
       return count;
    }
}