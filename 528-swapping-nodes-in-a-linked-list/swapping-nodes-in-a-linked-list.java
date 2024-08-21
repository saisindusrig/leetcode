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
    public ListNode swapNodes(ListNode head, int k) {
        // swap values of kth not the nodes
        ListNode temp = head;
        ListNode val1 = null; // storing kth nodes
        ListNode val2 = null;
        int c = 1;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (c == k) {
                val1 = temp; // found val 1
            }
            if (c == len - k + 1) {
                val2 = temp; // found val 2
            }
            c++;
            temp = temp.next;
        }
        // use node values only when swapping
        int d = val1.val;
        val1.val = val2.val;
        val2.val = d;
        return head;
    }
}