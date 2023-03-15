//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>st,int sizeOfStack){
        // code here
       int i = 0;
       delete(st,0,sizeOfStack/2);
    } 
    public static void delete(Stack<Integer>st,int count,int pos){
        
        if(st.isEmpty()){
            return;
        }
        if(count==pos){
            st.pop();
            return;
        }
       //int top = st.peek();
         int top =st.pop();
        delete(st,count+1,pos);
        st.push(top);
    }
}
