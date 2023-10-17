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
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        this.flag = true;
        inorder(root);
        return flag;
    }
    private void inorder(TreeNode root){
        if(root == null) return;
        if(flag){
            inorder(root.left);
        }
        
        if(prev != null && prev.val >= root.val){
            flag = false;
        }
        prev = root;
        if(flag){
            inorder(root.right);
        }
    }
    
}