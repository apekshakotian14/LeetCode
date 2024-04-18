class Solution {
    public void reverse(char[] s, int start, int end) {
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    
    public void reverseEachWord(char[] s) {
        int start = 0;
        int end = 0;
        
        while(start < s.length) {
            while(end < s.length && s[end] != ' ') {
                end++;
            }
            reverse(s, start, end-1);
            start = end + 1;
            end++;
        }
    }
    
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length-1);
        reverseEachWord(s);
    }
}