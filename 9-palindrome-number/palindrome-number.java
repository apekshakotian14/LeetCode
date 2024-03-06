class Solution {
    public boolean isPalindrome(int x) {
        int initialValue = x;

        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int reverse = 0;
        while(x > 0){
            int temp = x%10;
            reverse = (reverse * 10) + temp;
            x = x/10;
        }

        if(reverse == initialValue){
            return true;
        }

        return false;
    }
}