class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> levelOrder(TreeNode root) {
        this.results = new ArrayList<>();
        helper(root, 0);
        return results;
    }
    private void helper(TreeNode root, int level){
        if(root == null) return;
        if(level == results.size()){
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
}