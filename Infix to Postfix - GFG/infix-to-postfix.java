//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        
       Stack<Character>stack = new Stack<>();
       StringBuilder ans = new StringBuilder();
       
       for(int i = 0; i<exp.length(); i++){
           char ch = exp.charAt(i);
           
           if(Character.isLetterOrDigit(ch)){
               ans.append(ch);
           }
           else if(ch=='('){
               stack.push(ch);
           }
           else if(ch==')'){
               while(!stack.isEmpty() && stack.peek()!='('){
                   ans.append(stack.pop());
               }
               stack.pop();
           }
           else{
               while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                   ans.append(stack.pop());
               }
               stack.push(ch);
           }
       }
       
       while(!stack.isEmpty()){
           if(stack.peek()=='('){
               return "Invalid expression";
           }
           ans.append(stack.pop());
       }
       return ans.toString();
    }
    
    public static int precedence(char op){
        if(op=='^'){
            return 3;
        }
        else if(op=='*'||op=='/'){
            return 2;
        }
        else if(op=='+'||op=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
}