//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        // code here
        
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            
            if(!map.containsKey(s.charAt(i))){
                 map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
             
            }
        }
        
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int v : map.values()){
            pq.add(v);
        }
        
        
        while(k>0){
            int a = pq.poll();
            a--;
            pq.add(a);
            k--;
        }
        
        
        int sum = 0;
        
        while(!pq.isEmpty()){
            sum = sum+pq.peek()*pq.peek();
            pq.poll();
            
        }
        
        return sum;
        
    }
}