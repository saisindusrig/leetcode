/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode p = head;
        ListNode c = head.next;
        int sum = 0;
        while (c != null) {
            if (c.val == 0) {
                p.next = new ListNode(sum); // update prev with new node
                p = p.next;
                sum = 0; // sum--> 0
            } else { // until val =0
                sum += c.val;
            }
            c = c.next;

        }
        return head.next;
    }
}