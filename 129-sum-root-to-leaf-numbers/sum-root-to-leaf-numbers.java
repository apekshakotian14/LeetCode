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
    int result = 0;
    int currNum = 0;
    public int sumNumbers(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> numSt = new Stack<>();
        while(root !=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                currNum = currNum * 10 + root.val;
                numSt.push(currNum);
                root = root.left;
            }
            root = st.pop();
            currNum = numSt.pop();
            if(root.left == null && root.right == null){
                result += currNum;
            }
            root = root.right;
        }
        return result;

    }
}