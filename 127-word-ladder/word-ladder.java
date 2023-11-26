class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        
        int L = beginWord.length();

        // Queue for BFS
        Queue<Pair<String, Integer>> Q = new LinkedList<>();
        Q.add(new Pair<>(beginWord, 1));

        // Set to track visited words
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        while (!Q.isEmpty()) {
            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();

            for (String nextWord : wordList) {
                if (!visited.contains(nextWord) && isOneLetterApart(word, nextWord)) {
                    if (nextWord.equals(endWord)) {
                        return level + 1;
                    }
                    visited.add(nextWord);
                    Q.add(new Pair<>(nextWord, level + 1));
                }
            }
        }

        return 0;
    }

    // Helper function to check if two words are one letter apart
    private boolean isOneLetterApart(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
            }
        }
        return diffCount == 1;
    }
}
