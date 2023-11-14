class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slow = 0;
        int fast = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                while(s.charAt(slow) != c){
                    set.remove(s.charAt(slow));
                    slow++;
                }
                set.remove(s.charAt(slow));
                slow++;
            }
            set.add(c);
            max = Math.max(max, i-slow+1);
        }
        return max;

    }
}