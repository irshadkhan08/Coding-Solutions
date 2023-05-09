//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        
       //first method
       
    //   int count = 0;
    //   Node temp1 = head;
    //   while(temp1!=null){
    //       count++;
    //       temp1 = temp1.next;
    //   }
       
    //   Node insert = new Node(data);
    //   if(head==null){
    //       return insert;
    //   }
    //   //int mid = count/2;
       
    //   Node temp = head;
    //   if(count%2==0){
    //   int i = 0;
    //   int mid = count/2;
    //   while(i<mid-1){
    //       temp = temp.next;
    //       i++;
    //   }
    //   insert.next = temp.next;
    //   temp.next = insert;
    //   return head;
    //   }
    //   else{
     
     
    //   int i = 0;
    //   int mid = count/2;
    //   while(i<mid){
    //       temp = temp.next;
    //       i++;
    //   }
    //   insert.next = temp.next;
    //   temp.next = insert;
    //   return head;
    //   }
        
        //second method
        Node slow = head;
        Node fast = head;
          Node key = new Node(data);
          if(head==null){
              return key;
          }
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        key.next = slow.next;
        slow.next = key;
        return head;
    }
}