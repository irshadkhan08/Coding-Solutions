//{ Driver Code Starts
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

class LinkedList{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            Node head=null;
            for(int i=0;i<n;i++)
            {int a=sc.nextInt();
            if(head==null){
                head=new Node(a);
            }
            else
                insert(head,a);
            }
        
            Solve y = new Solve();
            System.out.println(y.countTriplets(head,x));
        }
    }
    public static Node insert(Node head,int a){
        if(head==null){
            return new Node(a);
        }
        head.next=insert(head.next,a);
        return head;
    }
    
}


// } Driver Code Ends


//User function Template for Java

class Solve
{
    static int countTriplets(Node head, int x) 
    { 
        //code here.
        ArrayList<Integer>al = new ArrayList<>();
        
        while(head!=null){
            al.add(head.data);
            head = head.next;
        }
        
        // Collections.sort(al);
        int count = 0;
        for(int i = 0; i<al.size(); i++){
            int l = i+1;
            int r = al.size()-1;
            int sum = 0;
            while(l<r){
                sum = al.get(i)+al.get(l)+al.get(r);
                if(sum==x){
                    count++;
                    l++;
                    r--;
                }
                else if(sum<x){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return count;
        
    } 
}