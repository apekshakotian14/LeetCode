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
    TreeNode parent_x;
    TreeNode parent_y;
    int depth_x;
    int depth_y;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, x, y, 0);
        return parent_x != parent_y && depth_x == depth_y;
    }
    private void dfs(TreeNode root, TreeNode parent, int x, int y, int depth){
        if(root == null) return;

        if(root.val == x){
            parent_x = parent;
            depth_x = depth;
        }
        if(root.val == y){
            parent_y = parent;
            depth_y = depth;
        }
        dfs(root.left, root, x, y, depth+1);
        dfs(root.right, root, x, y, depth+1);

    }
}