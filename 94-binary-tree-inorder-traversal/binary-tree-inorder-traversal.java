/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList<>();
        if(root == null) return l;
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(cur!=null || !s.isEmpty()){
            while(cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            l.add(cur.val);
            cur = cur.right;
        }
        return l;
    }
}