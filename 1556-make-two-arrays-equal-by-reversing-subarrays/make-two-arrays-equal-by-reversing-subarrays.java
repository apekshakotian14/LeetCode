class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] array = new int[1001];
        for(int i = 0;i<arr.length;i++){
            array[arr[i]]++;
            array[target[i]]--;
        }
        for(int i = 0;i< 1001;i++)
            if(array[i] != 0)
                return false;
        return true;
    }
}