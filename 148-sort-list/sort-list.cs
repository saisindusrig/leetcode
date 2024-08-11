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
    public ListNode SortList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode mid = getMid(head);
        ListNode left = SortList(head); //head=head
        ListNode right = SortList(mid); //mid = head
        return merge(left,right); //divided into 2 sorted lists and then sorted
    }
    public ListNode merge(ListNode list1, ListNode list2){
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(list1!=null && list2!=null){
            if(list1.val< list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        temp.next = (list1 != null) ? list1:list2;
        return ans.next;

    }
    public ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head!=null && head.next!=null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;


    }
    
}