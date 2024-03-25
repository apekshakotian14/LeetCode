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
    List<List<Integer>> results;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        this.results =  new ArrayList<>();
        helper(root, 0);
        return results;
    }
    private void helper(TreeNode root, int level){
        if(root == null) return;
        if(level == results.size()){
            results.add(new ArrayList<>());
        }
        if(level % 2 == 0) {
            // For even levels, traverse left first, then right
            results.get(level).add(root.val);
        } else {
            // For odd levels, traverse right first, then left
            results.get(level).add(0, root.val);
        }
       
        helper(root.left, level+1);
         helper(root.right, level+1);
        
    }
}