class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> results = new ArrayList<>();
        if(root == null) return results;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> li = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                li.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            results.add(li);
        }
        return results;
    }
}