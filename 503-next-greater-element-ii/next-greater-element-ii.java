class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        Arrays.fill(result, -1);
        for(int i=0; i< 2 * n; i++){
            while(!st.isEmpty() && nums[i%n] > nums[st.peek()]){
                int popped = st.pop();
                result[popped] = nums[i%n];
            }
            if(i < n){
                st.push(i);
            }
        }
        return result;
    }
}