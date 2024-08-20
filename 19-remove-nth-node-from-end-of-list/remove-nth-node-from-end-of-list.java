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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // nth from end
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (len == n) {
            return head.next;
        }
        int a = len - n; 
        temp = head;
        int count = 1;
        while (temp != null) {
            if (count == a) {
                temp.next = temp.next.next;
                break;
            } else {
                count++;
                temp = temp.next;
            }
        }
        return head;
    }
}