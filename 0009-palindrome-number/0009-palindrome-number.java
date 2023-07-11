class Solution {
    public boolean isPalindrome(int x) {
        int initalValue = x;
        
        if(x<0){
            return false;
        }
        
        if(x==0){
            return true;
        }
        int reverse = 0;
        
        while(x>0){
            int temp = x%10;
            reverse = (10 * reverse) + temp;
            x=x/10;
        }
        
        if(reverse != initalValue){
            return false;
        }
        return true;
    }
}