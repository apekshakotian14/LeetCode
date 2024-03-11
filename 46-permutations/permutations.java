class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        helper(nums, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, List<Integer> path){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int num: nums){
            if(!path.contains(num)){
                path.add(num);
                helper(nums, path);
                path.remove(path.size()-1);
            }
        }
    }
}