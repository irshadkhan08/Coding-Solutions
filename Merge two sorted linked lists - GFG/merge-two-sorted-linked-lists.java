//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


class MergeLists
{
    Node head;



  /* Function to print linked list */
   public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
			Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }
			
			LinkedList obj = new LinkedList();
			Node head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
         }
    }
}

// } Driver Code Ends


/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     
   
     if(head1==null){
         return head2;
     }
     if(head2==null){
         return head1;
     }
     if(head1.data<=head2.data){
         return solve(head1,head2);
     }
     else{
         return solve(head2,head1);
     }
   } 
   
   Node solve(Node head1,Node head2){
     
        if(head1.next==null){
          head1.next = head2;
          return head1;
        }
       
       Node cur = head1;
       Node next1 = head1.next;
       Node cur2 = head2;
       Node next2 = cur2.next;
       
       while(next1!=null && cur2!=null ){
           
           if(cur.data<=cur2.data && cur2.data<=next1.data){
               
               cur.next = cur2;
               next2 = cur2.next;
               cur2.next = next1;
               
               cur = cur2;
               cur2 = next2;
               
           }
           else{
              cur = next1;
              next1 = next1.next;
              
              if(next1==null){
                  cur.next = cur2;
                  return head1;
              }
               
           }
       }
       return head1;
   }
}
