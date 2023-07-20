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
    public boolean isValidBST(TreeNode root) {
        return validateBST(root, null, null);
    }
    
    public boolean validateBST(TreeNode root, Integer max, Integer min){
        if(root==null){
            return true;
        }else if(max!=null && root.val>=max || min!=null && root.val<=min){
            return false;
        }else{
            return validateBST(root.left, root.val, min) && validateBST(root.right, max, root.val);
        }
    }
}