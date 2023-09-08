//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String str) {
        // Your code goes here
          
       
        HashSet<Character>set = new HashSet<>();
        int n = str.length();
        for(int i = 0; i<n; i++){
            set.add(str.charAt(i));
        }
        int k = set.size();
        char arr[] = str.toCharArray();
         int map[] = new int[256];
        int i = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        int mapsize = 0;
        while(j<n){
            map[str.charAt(j)]++;
            if(map[str.charAt(j)]==1){
                mapsize++;
            }
            if(mapsize==k){
                while(map[str.charAt(i)]>1){
                      map[str.charAt(i)]--;
                       i++;
                }
                ans = Math.min(ans,j-i+1);
            }
            j++;
        }
        return ans;
          
          

          
        // HashSet<Character>set = new HashSet<>();
        // int n = str.length();
        // for(int i = 0; i<n; i++){
        //     set.add(str.charAt(i));
        // }
        
        // int k = set.size();
        
        // char arr[] = str.toCharArray();
        // HashMap<Character,Integer>map = new HashMap<>();
        // int i = 0;
        // int j = 0;
        // int ans = Integer.MAX_VALUE;
        // while(j<n){
        //     map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            
        //     if(map.size()==k){
        //         while(map.get(arr[i])>1){
        //               map.put(arr[i],map.getOrDefault(arr[i],0)-1);
        //               i++;
        //         }
        //         ans = Math.min(ans,j-i+1);
        //     }
        //     j++;
        // }
        // return ans;
    }
}