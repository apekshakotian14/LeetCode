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
    public int sumNumbers(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> numSt = new Stack<>();
        int result = 0;
        int currNum = 0;
        st.push(root);
        numSt.push(currNum);
        while(!st.isEmpty()){
            root = st.pop();
            currNum = numSt.pop();
            currNum = currNum * 10 + root.val;
            if(root.left == null && root.right == null){
                result += currNum;
            }
            if(root.left != null){
                st.push(root.left);
                numSt.push(currNum);
            }
            if(root.right != null){
                st.push(root.right);
                numSt.push(currNum);
            }
        }
        return result;

    }
}