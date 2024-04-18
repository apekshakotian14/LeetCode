class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        int longestSeq = 0;

        for (int num : set) {
            if (!set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestSeq = Math.max(longestSeq, currentStreak);
            }
        }

        return longestSeq;

    }
}