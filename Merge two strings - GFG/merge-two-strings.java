//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        int s1 = S1.length();
        int s2 = S2.length();
        String str = "";
        if(s1>s2){
            for(int i = 0; i<s2; i++){
                str = str+S1.charAt(i)+S2.charAt(i);
            }
            for(int i = s2; i<s1; i++){
                str = str+S1.charAt(i);
            }
        }
        else if(s1<s2){
            
            for(int i = 0; i<s1; i++){
                str = str+S1.charAt(i)+S2.charAt(i);
            }
            for(int i = s1; i<s2; i++){
                str = str+S2.charAt(i);
            }
        }
        else{
            for(int i = 0; i<s1; i++){
                str = str+S1.charAt(i)+S2.charAt(i);
            }
        }
        return str;
    }
} 