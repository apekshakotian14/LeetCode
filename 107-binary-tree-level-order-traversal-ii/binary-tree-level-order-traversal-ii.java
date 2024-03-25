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
    List<List<Integer>> results = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return results;
        helper(root, 0);
        Collections.reverse(results);
        return results;
    }

    public void helper(TreeNode node, int level) {
        if (results.size() == level){
             results.add(new ArrayList<Integer>());
        }
        results.get(level).add(node.val);
        if(node.left != null)
            helper(node.left, level + 1);
        if(node.right != null)
            helper(node.right, level + 1);
    }
}