class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> levelOrder(TreeNode root) {
        this.result = new ArrayList<>();
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int level){
        if(root == null) return;
        if(level == result.size()){
            result.add(new ArrayList<>());
        }

        result.get(level).add(root.val);
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
}