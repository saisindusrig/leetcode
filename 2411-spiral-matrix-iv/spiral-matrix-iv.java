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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat = new int[m][n];
        int rs = 0, re = m - 1, cs = 0, ce = n - 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = -1;
            }
        }
        while (rs <= re && cs <= ce && head != null) {
            for (int i = cs; i <= ce; i++) {
                if (head != null) {
                    mat[rs][i] = head.val;
                    head = head.next;
                } else {
                    mat[rs][i] = -1;
                }
            }
            rs++;
            for (int j = rs; j <= re; j++) {
                if (head != null) {
                    mat[j][ce] = head.val;
                    head = head.next;
                } else {
                    mat[j][ce] = -1;
                }
            }
            ce--;
            if (rs <= re) {
                for (int k = ce; k >= cs; k--) {
                    if (head != null) {
                        mat[re][k] = head.val;
                        head = head.next;
                    } else {
                        mat[re][k] = -1;
                    }
                }
                re--;
            }
            if (cs <= ce) {
                for (int l = re; l >= rs; l--) {
                    if (head != null) {
                        mat[l][cs] = head.val;
                        head = head.next;
                    } else {
                        mat[l][cs] = -1;
                    }
                }
                cs++;
            }
        }
        return mat;
    }
}