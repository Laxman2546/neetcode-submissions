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
    public TreeNode invertTree(TreeNode root) {
        return solve(root);
    }
    public TreeNode solve(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode invertL = solve(root.left);
        TreeNode invertR = solve(root.right);
        root.right = invertL;
        root.left = invertR;
        return root;
    }
}
