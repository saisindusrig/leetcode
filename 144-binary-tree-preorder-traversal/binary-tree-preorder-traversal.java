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
            // write code here
        //root-left-right
        ArrayList<Integer> l = new ArrayList<>();
        if(root == null) return l;
        Stack<TreeNode> s = new Stack<>();
        TreeNode c = root;
        s.push(c);
        while(!s.isEmpty()){
            TreeNode node = s.pop();
            l.add(node.val);
            if(node.right!=null) s.push(node.right);
            if(node.left !=null) s.push(node.left);
        }
        return l;
    }
    
}