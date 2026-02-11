class Solution {
    public boolean hasSameDigits(String s) {
        // Keep performing operations until only 2 digits remain
        while (s.length() > 2) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int sum = (s.charAt(i) - '0' + s.charAt(i + 1) - '0') % 10;
                next.append(sum);
            }
            s = next.toString();
        }

        // Return true if the last two digits are the same
        return s.charAt(0) == s.charAt(1);
    }
}
