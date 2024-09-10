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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
    ListNode d = new ListNode(0);
    d.next = head;
    ListNode cur = head;
    while(cur!=null && cur.next!=null){
        int num1 = cur.val;
        int num2 = cur.next.val;
        int gcdVal = gcd(num1,num2);
        ListNode gcdNode = new ListNode(gcdVal);
        gcdNode.next = cur.next;
        cur.next = gcdNode;
        cur = gcdNode.next;

    }
    return d.next;
    }
    public int gcd(int num1, int num2){
        while(num2!=0){
            int t = num2;
            num2 = num1%num2;
            num1 = t;
        }
        return num1;
    }
}
