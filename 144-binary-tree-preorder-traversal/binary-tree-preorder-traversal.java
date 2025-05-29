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
            
            List<Integer> l = new ArrayList<>();
            if(root==null) return l;
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            
            while(!s.isEmpty()){
                TreeNode n = s.pop();
                l.add(n.val);
                if(n.right!=null) s.push(n.right);
                if(n.left!=null) s.push(n.left);

            }
           return l; 
    }
    
    
}