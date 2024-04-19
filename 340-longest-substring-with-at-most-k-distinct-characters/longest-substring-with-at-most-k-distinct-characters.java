class Solution {
        public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // Create a HashMap to store characters and their frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        // Initialize variables
        int max = 0;
        int slow = 0;

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Update the frequency of the current character
            map.put(c, map.getOrDefault(c, 0) + 1);

            // If the map size exceeds k, remove characters until it's valid
            while (map.size() > k) {
                char leftChar = s.charAt(slow);
                int count = map.get(leftChar);
                if (count == 1) {
                    map.remove(leftChar);
                } else {
                    map.put(leftChar, count - 1);
                }
                slow++;
            }

            // Update the maximum length of substring
            max = Math.max(max, i - slow + 1);
        }

        return max;
    }
}
