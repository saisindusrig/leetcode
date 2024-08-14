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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }
        ListNode p = prev;
        ListNode q = prev.next;
        ListNode curr = prev.next;
        for(int i=0;i<right-left+1;i++){
            ListNode n = curr.next;
            curr.next = prev;
            prev= curr;
            curr=n;
        }
        p.next= prev;
        q.next=curr;
        return dummy.next;
    }
    
}