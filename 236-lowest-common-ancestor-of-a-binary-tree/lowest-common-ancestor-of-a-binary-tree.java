/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();
        //p,q==to find
        if(!pathfinder(root,path1,p) || !pathfinder(root,path2,q)){
            return null;
        }
        int i=0;
        for(; i<path1.size() && i<path2.size();i++){
            if(path1.get(i) !=path2.get(i)) return path1.get(i-1); //if data is diff
        }
        return path1.get(i-1);
    }
    public boolean pathfinder(TreeNode node, List<TreeNode> path,TreeNode a){
        if(node==null) return false;
        path.add(node);
        if(node==a || pathfinder(node.left,path,a)|| pathfinder(node.right,path,a)) return true;

        //backtrack
        path.remove(path.size()-1);
        return false;
    }
}