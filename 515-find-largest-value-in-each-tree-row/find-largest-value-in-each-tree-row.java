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
    List<Integer> result;
    
    public List<Integer> largestValues(TreeNode root) {
        result = new ArrayList<Integer>();
        dfs(root, 0);
        return result;
    }
    
    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        
        if (depth == result.size()) {
            result.add(root.val);
        } else {
            result.set(depth, Math.max(result.get(depth), root.val));
        }
        
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}