//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            int ans = ob.findLength(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int findLength(String s) 
    { 
        // code here
       
       
       // This is first method :01
       
    //   int l = 0;
       
    //   char ch1 = s.charAt(s.length()-1);
    //   if(ch1==32){
    //       l = 0 ;
    //   }
    //   else{
    //       l = l+1;
    //   }
    
    //   for(int i = s.length()-2; i>=0; i--){
    //       char ch = s.charAt(i);
           
    //       if((ch>=65 && ch<=97)||(ch>=97 && ch<=122)){
    //           l++;
    //       }
    //       else{
    //           break;
    //       }
    //   }

    //   return l;
    
    
    // This is second method : 02
    
    int l = 0;
    String trim = s.trim();
    char ch[] = trim.toCharArray();
    for(int i = ch.length-1;i>=0; i-- ){
        l++;
        
        if(ch[i]==32){
            return l-1;
        }
    }
    return l;
    
    }
}