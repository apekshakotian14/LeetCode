class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
           return false;
       }
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        for(int i=0; i<array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}