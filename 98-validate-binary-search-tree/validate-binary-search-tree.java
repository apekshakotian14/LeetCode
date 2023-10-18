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
    boolean flag;
    public boolean isValidBST(TreeNode root) {
        this.flag = true;
        helper(root, null, null);
        return flag;
    }
    private void helper(TreeNode root, Integer min, Integer max){
        if(root == null) return;
        if(min != null && root.val<=min){
            this.flag = false;
        }
        if(max != null && root.val>=max){
            this.flag = false;
        }
        if(flag){
            helper(root.left, min, root.val);
        }
        if(flag){
            helper(root.right, root.val, max);
        }
        
    }
    
}