class Solution {
    public int xorOperation(int n, int start) {
        int ans=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= start + (2*i);
            ans^=arr[i];
        }
        return ans;
    }
}