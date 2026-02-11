class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // Just add 1 if not 9
                return digits;
            }
            digits[i] = 0;     // If 9, set to 0 and continue
        }

        // If all were 9, we need an extra digit
        int[] result = new int[n + 1];
        result[0] = 1;  // like [1,0,0,...]
        return result;
    }
}
