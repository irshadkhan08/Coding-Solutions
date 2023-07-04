//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        
        // This is first method : 01
        // List<String>list = new ArrayList<String>();
       
        // String alpha = "",digit = "",spe = "";
        // for(int i = 0; i<S.length(); i++){
        //     char ch = S.charAt(i);
        //     if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
        //         alpha+=ch;
        //     }
        //     else if(ch>='0' && ch<='9'){
        //         digit+=ch;
        //     }
        //     else {
        //         spe+=ch;
        //     }
        // }
        // list.add(alpha);
        // list.add(digit);
        // list.add(spe);
        // return list;
        
        
        //This is second method : 02
        
        List<String>lt = new ArrayList<>();
        
        String alp,dig,spcChar;
        
        alp = S.replaceAll("[^a-zA-Z]","");
        dig = S.replaceAll("[^0-9]", "");
        spcChar = S.replaceAll("[A-Za-z0-9]",  "");
        
    
        lt.add(alp.length() > 0 ? alp : "-1");
        lt.add(dig.length() > 0 ? dig : "-1");
        lt.add(spcChar.length() > 0 ? spcChar : "-1");
        return lt;
    
        
    }
} 
