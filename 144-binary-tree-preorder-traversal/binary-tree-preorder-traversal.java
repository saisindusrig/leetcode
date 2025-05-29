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
    public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> s = new ArrayList<>();
            pot(root,s);
            return s;
    }
    public void pot(TreeNode root,List<Integer> s){
        if(root==null) return;
        s.add(root.val);
        if(root.left!=null) pot(root.left,s);
        if(root.right!=null) pot(root.right,s);
    }
    
}