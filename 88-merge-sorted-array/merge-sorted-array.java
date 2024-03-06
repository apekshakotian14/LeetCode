class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int index = m+n-1;
       int p = m-1;
       int q = n-1;

       while(p>=0 && q>=0){
           if(nums1[p] > nums2[q]){
               nums1[index] = nums1[p];
               p--;
               index--;
           }else{
               nums1[index] = nums2[q];
               q--;
               index--;
           }
       }

       while(p>=0){
           nums1[index] = nums1[p];
            p--;
            index--;
       }

       while(q>=0){
           nums1[index] = nums2[q];
            q--;
            index--;
       }
    }
}