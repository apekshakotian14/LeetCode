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
    public int countNodes(TreeNode root) {
        if(root==null){   
            return 0;
        }else if(root.right==null){   
            return countNodes(root.left) + 1;
        }else if(root.left==null){   
            return countNodes(root.right) + 1;
        }else{   
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
}