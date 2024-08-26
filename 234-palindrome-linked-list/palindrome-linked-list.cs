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
    public bool IsPalindrome(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
        }
        if(f!=null) s=s.next; 
        s = reverse(s);
        while(s!=null && s.val==head.val){
            head = head.next;
            s=s.next;
        }
        return s==null;


    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
        }
        return prev;
    }
}