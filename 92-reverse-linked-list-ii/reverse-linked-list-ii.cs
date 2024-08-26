/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }
        ListNode p = prev;
        ListNode q = prev.next;
        ListNode cur = q;
        for(int i=0;i<right-left+1;i++){
            ListNode n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n; 
        }
        p.next = prev;
        q.next = cur;
        return dummy.next;
    }
}