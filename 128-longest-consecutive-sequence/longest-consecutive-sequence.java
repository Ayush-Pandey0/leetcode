class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
        }

        int longest = 0;

        for (int i : s) {
            if (!s.contains(i - 1)) {
                int curr = i;
                int length = 1;

                while (s.contains(curr + 1)) {
                    curr++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}