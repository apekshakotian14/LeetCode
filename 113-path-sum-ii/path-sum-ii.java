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
    List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.result = new ArrayList<>();
        helper(root, 0, targetSum, new ArrayList<>());
        return result;

    }
    private void helper(TreeNode root, int currSum, int targetSum, List<Integer> path){
        if(root == null) return;

        currSum += root.val;
        path.add(root.val);
        helper(root.left, currSum, targetSum, new ArrayList<>(path));
        helper(root.right, currSum, targetSum, new ArrayList<>(path));
        if(root.left == null && root.right == null){
            if(currSum == targetSum){
                result.add(path);
            }
        }

    }
}