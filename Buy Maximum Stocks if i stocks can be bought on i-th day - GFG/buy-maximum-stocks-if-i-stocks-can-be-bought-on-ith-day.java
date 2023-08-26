//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
  
        Map<Integer,Integer>map = new TreeMap<>();
        
        for(int i = 0; i<n; i++){
            map.putIfAbsent(price[i],0);
            map.put(price[i],map.get(price[i])+(i+1));
        }
        
        int stock = 0;
        int sum = 0;
        for(Map.Entry<Integer,Integer>mp:map.entrySet()){
            // System.out.println(mp.getKey()+" "+mp.getValue());
            
            int val1 = mp.getKey();
            int val2 = mp.getValue();
        
            sum = sum+val1*val2;
            if(sum<=k){
                stock = stock+val2;
            }
            else{
                sum = sum-(val1*val2);
                 k = k-sum;
                int remain = k/val1;
                stock = stock+k/val1;
                break;
            }
        }
        return stock;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//   Map<Integer,Integer> map = new TreeMap<>();

//         for(int i = 0 ; i < n ; i++){

//             map.putIfAbsent(price[i],0);

//             map.put(price[i],map.get(price[i])+(i+1));

//         }

//         int stock = 0;

//         for(Map.Entry<Integer,Integer> mp : map.entrySet()){

//             if(k<mp.getKey()*mp.getValue()){

//                 int temp = k/mp.getKey();

//                 stock+=temp;

//                 k-=mp.getKey()*temp;

//             }

//             else{

//                 stock+=mp.getValue();

//                 k-=mp.getKey()*mp.getValue();

//             }

//         }

//         return stock;
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}