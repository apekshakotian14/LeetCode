class Solution {
    public int addDigits(int num) {
        int temp = 0;
        int sum = 0;
        while(num >= 0){
            temp = num%10;
            num = num/10;
            sum = temp + num;
            num = sum;
            if(num<10){
                return sum;
            }
        }
        return 0;
    }
}