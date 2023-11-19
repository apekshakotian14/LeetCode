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
    ArrayList<TreeNode> list;
    public void flatten(TreeNode root) {
        if(root==null) return;
        list=new ArrayList<>();
        preorder(root);
        retriveFromList();
    }
    
    public void preorder(TreeNode root){
        if(root==null) return;
        list.add(root);
        preorder(root.left);
        preorder(root.right);
    }
    
    public TreeNode retriveFromList(){
        for(int i=0;i<list.size()-1;++i){
            TreeNode ele =list.get(i);
            ele.left=null;
            ele.right=list.get(i+1);
        }
        return list.get(0);
    }
}