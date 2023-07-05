//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here  
       
        int upper=0,lower = 0,digit = 0,other = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch>=65 && ch<=90){
                 upper++;
            }
            else if(ch>=97 && ch<=122){
                 lower++;
            }
         
            else if(ch>='0' && ch<='9'){
                digit++;
            }
            else{
                other++;
            }
        }
        
        ArrayList<Integer>list = new ArrayList<>();
        list.add(upper);
        list.add(lower);
        list.add(digit);
        list.add(other);
        int ans[] = new int[list.size()];
        int k = 0;
        for(int i = 0; i<list.size(); i++)
        {
            ans[k++] = list.get(i);
        }
        return ans;
    }
}