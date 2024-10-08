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
    public ListNode MiddleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(first!=null && first.next!=null){
            second = second.next;
            first = first.next.next;
        }
        return second;
    }
}