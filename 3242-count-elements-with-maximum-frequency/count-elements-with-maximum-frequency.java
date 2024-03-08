class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (int freq : map.values()) {
            if (freq == maxFreq)
                count += maxFreq;
        }
        return count;
    }
}