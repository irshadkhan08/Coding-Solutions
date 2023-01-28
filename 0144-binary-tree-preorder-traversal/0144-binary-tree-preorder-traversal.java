/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<Integer>();
        
        preOrder(root,list);
        
        return list;
    }
    private static void preOrder(TreeNode root, List<Integer>list){
        if(root==null)return;
        
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
        
    }
}