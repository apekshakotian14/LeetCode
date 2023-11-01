class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        this.result = new ArrayList<>();
        helper(nums, 0, new ArrayList<Integer>());
        return result;
    }

    private void helper(int[] nums, int pivot, List<Integer> path){
        result.add(new ArrayList<>(path));

        for(int i=pivot; i<nums.length; i++){
            path.add(nums[i]);
            helper(nums, i+1, path);
            path.remove(path.size() - 1);
        }
    
    }
}