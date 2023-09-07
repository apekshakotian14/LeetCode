class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int n = digits.length;
        int[] newArray = new int[n+1];
        newArray[0] = 1;
        return newArray;
    }
}