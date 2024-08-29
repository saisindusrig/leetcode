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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        } //calculate org len

        k = k % n;
        temp.next = head; // connect the last node to the head

        ListNode prev = head;
        for (int i = 0; i < n - k - 1; i++) {
            prev = prev.next; //tail
        }
        ListNode newHead = prev.next;
        prev.next = null; // disconnect the new tail from the rest of the list

        return newHead;
    }
}