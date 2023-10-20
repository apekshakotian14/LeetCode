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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currSum;
        flag = helper(root, 0, targetSum);
        return flag;

    }
    private boolean helper(TreeNode root, int currSum, int targetSum){
        if(root == null) return false;
        currSum += root.val;
        helper(root.left, currSum, targetSum);
        helper(root.right, currSum, targetSum);
        if(root.left == null && root.right == null){
            if(currSum == targetSum){
                flag = true;
                return flag;
            }
        }
        return flag;
    }
}