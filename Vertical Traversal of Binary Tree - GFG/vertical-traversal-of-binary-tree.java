//{ Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution obj = new Solution();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	        
	        }
	}
}

// } Driver Code Ends


//User function Template for Java




//User function Template for Java


class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        
        // -2   -> (-2,4)
        // -1   ->(-1,2)
        //  0    ->(0,5),(0,6)
        //  1    ->(1,3),(1,8)
        //  2    ->(2,7),
        //  3    ->(3,9)
         
         ArrayList<Integer>ans = new ArrayList<Integer>();
         if(root==null) return ans;
         
         Queue<Pair>q = new LinkedList<>();
         q.add(new Pair(0,root));
         
         Map<Integer,ArrayList<Integer>>map = new TreeMap<>();
         
         while(!q.isEmpty()){
             Pair cur = q.poll();
            
            int key = cur.hd;
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<Integer>());
            }
            map.get(key).add(cur.root.data);
            if(cur.root.left!=null){
               // q.add(key-1,cur.root.left);
                q.add(new Pair(key-1,cur.root.left));
            }
             if(cur.root.right!=null){
                q.add(new Pair(key+1,cur.root.right));
                
            }
        
         }
         for(ArrayList<Integer>res : map.values()){
                ans.addAll(res);
        }
        return ans;
    }
    static class Pair{
        int hd;
        Node root;
        
        Pair(int hd, Node root){
            this.hd = hd;
            this.root = root;
        }
    }
}