class Solution {
    int sign = 1;
    int i = 0;

    public int myAtoi(String s) {
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        return convert(s, 0);
    }

    private int convert(String s, int m) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return m * sign;
        }

        int digit = s.charAt(i) - '0';

        // ✅ overflow check BEFORE building number
        if (m > Integer.MAX_VALUE / 10 ||
           (m == Integer.MAX_VALUE / 10 && digit > 7)) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        i++;
        return convert(s, m * 10 + digit);
    }
}
