class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        result[0] = 1;
        //calculating the left sub array - calculating the product left to the element
        for(int i=1; i<nums.length; i++){
            product = product * nums[i-1];
            result[i] = product;
        }
        //calculating the right sub array - calculating the product right to the element
        product = 1;
        for(int i=nums.length-2; i>=0; i--){
            product = product * nums[i+1];
            result[i] = result[i] * product;
        }

        return result;

    }
}