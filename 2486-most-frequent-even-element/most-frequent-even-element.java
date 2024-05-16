class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] arr=new int[100001];
        for(int i=0;i<nums.length;i++){
            int x=0;
            if(nums[i]%2==0){
                x=nums[i];
                arr[x]++;
            }
        }
        int max=0;
        int element=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                element=i;
            }
        }
        return element;
    }
}