class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int pos1 = -1;
        int pos2 = -1;
        
        for(int i=0 ; i<wordsDict.length; i++) {
            if(wordsDict[i].equals(word1)) {
                pos1 = i;
            }
            
            if(wordsDict[i].equals(word2)) {
                pos2 = i;
            }
            
            if(pos1 != -1 && pos2 != -1) {
                min = Math.min(min, Math.abs(pos1-pos2));
            }
        }
        return min;
          
    }
}