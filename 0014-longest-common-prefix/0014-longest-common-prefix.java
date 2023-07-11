class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix = "";
    
       if(strs == null || strs.length == 0) {
           return prefix;
       }
        
       int index = 0;
       for(char c : strs[0].toCharArray()) {
           for(int i=1 ; i<strs.length ; i++) {
               if(index >= strs[i].length() || c != strs[i].charAt(index)) {
                   return prefix;
               }
           }
           prefix += c;
           index++;
       }
        return prefix;
    }
}