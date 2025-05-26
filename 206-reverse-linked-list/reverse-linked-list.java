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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        while(pres!=null){
            ListNode n = pres.next;
            pres.next = prev;
            prev = pres;
            pres =n;

        }
        return prev;
    }
}