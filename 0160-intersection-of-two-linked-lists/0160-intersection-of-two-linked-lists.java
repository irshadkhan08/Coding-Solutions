/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        
        
     ListNode node1 = head1;
      ListNode node2 = head2;
      
      int len1 = 0;
      int len2 = 0;
      
      while(node1!=null){
             len1++;
          node1 = node1.next;
       
      }
      
      while(node2!=null){
          len2++;
          node2 = node2.next;
      }
      
      node1 = head1;
      node2 = head2;
      int dif = Math.abs(len1-len2);
      
      
      while(len1>len2){
          node1 = node1.next;
          len1--;
      }
      while(len1<len2){
          node2 = node2.next;
          len2--;
      }
      
      ListNode ans = null;
      while(node1!=null && node2!=null){
          if(node1==node2){
              ans = node1;
              break;
          }
          node1 = node1.next;
          node2 = node2.next;
      }
      
      return ans;
        
    }
}