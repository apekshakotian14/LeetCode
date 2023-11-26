class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> wordSet = new HashSet<>(wordList);
        Set<String> set = new HashSet<>();
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair(beginWord, 1));
        set.add(beginWord);
        while (!queue.isEmpty()) {
            Pair<String, Integer> node = queue.poll();
            String currentWord = node.getKey();
            int count = node.getValue(); // Rename level to count

            for (int i = 0; i < currentWord.length(); i++) {
                char[] wordChars = currentWord.toCharArray();

                for (char c = 'a'; c <= 'z'; c++) {
                    wordChars[i] = c;
                    String newWord = new String(wordChars);

                    if (wordSet.contains(newWord)) {
                        if (newWord.equals(endWord)) {
                            return count + 1;
                        }

                        if (!set.contains(newWord)) {
                            set.add(newWord);
                            queue.add(new Pair(newWord, count + 1)); 
                        }
                    }
                }
            }
        }

        return 0;
    }
}
