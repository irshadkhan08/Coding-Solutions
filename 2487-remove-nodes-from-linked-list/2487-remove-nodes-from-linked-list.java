/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode cur = head;
       ListNode prev = null;

        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        ListNode ans = null;
        int largest = prev.val;
        while(prev!=null && prev.next!=null){
            if(prev.val>=largest ){
                ListNode temp = prev.next;
                prev.next = ans;
                ans = prev;
                prev = temp;
                largest = ans.val;
            }else{
                prev = prev.next; 
            }
        }
        if(prev.val>=ans.val){
                ListNode temp = prev.next;
                prev.next = ans;
                ans = prev;
                prev = temp;
        }
        return ans;
        
    }
}