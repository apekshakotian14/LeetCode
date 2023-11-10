class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m > n) return intersect(nums2, nums1);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> li = new ArrayList<>();
        int low = 0; int high = n-1;
        for(int i=0; i<m; i++){
            int target = nums1[i];
            int index = binarySearch(nums2, low, high, target);
            if(index != -1){
                low = index + 1;
                li.add(target);
            }
        }
        int[] result = new int[li.size()];
        for(int i=0; i<li.size(); i++){
            result[i] = li.get(i);
        }
        return result;
    }

    private int binarySearch(int[] arr, int low, int high, int target){
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                if(mid == low || arr[mid - 1] < arr[mid]){
                    return mid;
                }else{
                    high = mid - 1;
                }
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}