//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            String ans = new Solution().solve(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java





class Solution {
    String solve(int[] arr, int n) {
        // code here
        

    Arrays.sort(arr);
    ArrayList<Integer>al1 = new ArrayList<Integer>();
    ArrayList<Integer>al2 = new ArrayList<Integer>();
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i<n; i++){
        if(i%2==0){
            al1.add(arr[i]);
        }
        else{
            al2.add(arr[i]);
        }
    }
    

    int i =  al1.size()-1;
    int j = al2.size()-1;
    int carry = 0;
    while(i>=0 && j>=0){
        int temp = al1.get(i)+al2.get(j)+carry;
        int val = temp%10;
        sb.append(val);
        carry = temp/10;
        i--;
        j--;
    }
    
    while(i>=0){
        int temp = al1.get(i)+carry;
        int val = temp%10;
        sb.append(val);
        carry = temp/10;
        i--;
    }
    while(j>=0){
        int temp = al1.get(j)+carry;
        int val = temp%10;
        sb.append(val);
        carry = temp/10;
        j--;
    }
    
    if(carry!=0){
        sb.append(carry);
        // carry = carry/10;
    }
    String ans =  (sb.reverse()).toString();
    
    for(int ii = 0; ii<ans.length(); ii++){
        if(ans.charAt(ii)!='0'){
            return ans.substring(ii);
        }
    }
    
   return "0";
    }
}
