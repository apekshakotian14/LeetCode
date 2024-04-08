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
        dfs(root);
        return result;
    }

    private List<Integer> result = new ArrayList<>();

    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        result.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}