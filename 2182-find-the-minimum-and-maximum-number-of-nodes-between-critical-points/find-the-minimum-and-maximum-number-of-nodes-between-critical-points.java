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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // if less<num>less or more<num>more
        // first check the size
        if (head == null || head.next == null || head.next.next == null) {
            return new int[] { -1, -1 };
        }
        ListNode prev = head;
        ListNode cur = prev.next;
        ListNode xt = cur.next;
        int len = 2; // start from cur
        // create arrList of len
        List<Integer> arrL = new ArrayList<>();
        while (xt != null) {
            if ((prev.val > cur.val && cur.val < xt.val) || (prev.val < cur.val && cur.val > xt.val)) {
                // then add it to arrL
                arrL.add(len);
            }
            prev = cur;
            cur = xt;
            xt = cur.next;
            len++;
        }
        if (arrL.size() < 2) {
            return new int[] { -1, -1 };
        }
        int[] arr = new int[2];
        int min = Integer.MAX_VALUE;
        // min can be anywhere so we have to compare
        for (int i = 1; i < arrL.size(); i++) {
            min = Math.min(min, arrL.get(i) - arrL.get(i - 1));
        }
        arr[0] = min;
        arr[1] = arrL.get(arrL.size() - 1) - arrL.get(0);
        return arr;

    }
}