class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] charArray = new int[26];
        for(int i=0; i<s.length(); i++){
            charArray[s.charAt(i) - 'a']++;
            charArray[t.charAt(i) - 'a']--;
        }

        for (int count: charArray){
            if(count > 0){
                return false;
            }
        }

        return true;

    }
}