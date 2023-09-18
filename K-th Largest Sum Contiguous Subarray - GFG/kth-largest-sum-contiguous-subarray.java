//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int K; 
            K = Integer.parseInt(br.readLine());
            
            
            int[] Arr = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.kthLargest(N, K, Arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int kthLargest(int N, int K, int[] Arr) {
        // code here
        
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i<N; i++){
            int sum = Arr[i];
            list.add(Arr[i]);
            
            for(int j = i+1; j<N; j++){
                sum  = sum+Arr[j];
                list.add(sum);
            }
            sum = 0;
        }
        Collections.sort(list);
        int ans[] = new int[list.size()];
        int index = 0;
        
        for(int i = 0; i<list.size(); i++){
            ans[index++] = list.get(i);
        }
        
        int res = ans[ans.length-K];
        return res;
        
        
        
        // PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        // int index = 0;
        // for(int i = 0; i<N; i++){
        //     int sum = Arr[i];
        //      pq.add(sum);
            
        //     for(int j = i+1; j<N; j++){
        //       sum = sum+Arr[j];
        //       pq.add(sum);
        //     }
        //     sum = 0;
        // }
        
        // for(int i = 0; i<K-1; i++){
        //   pq.poll();
        // }
        // return pq.peek();        
     
    }
}
        
