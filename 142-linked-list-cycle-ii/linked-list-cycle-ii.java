/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //fast and slow pointer method
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){ //s,f
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        
        
        
        //two pointers
        ListNode p1=head;
        ListNode p2 =slow; //in the cycle
        while(p1 != p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}