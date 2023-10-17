//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        
        Node cur = head;
        
        Node prev = null;
        while(cur!=null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        Node ans = null;
        int carry = 1;
        
        while(prev!=null){
    
                int sum = (prev.data+carry);
                int digit = sum%10;
                carry = sum/10;
                Node temp = new Node(digit);
                if(ans==null){
                    ans = temp;
                }
                else{
                    temp.next = ans;
                    ans = temp;
                }
                prev = prev.next;
                
        }
        if(carry!=0){
            Node temp = new Node(carry%10);
            temp.next = ans;
            ans = temp;
        }
        
        return ans;
    }
}
