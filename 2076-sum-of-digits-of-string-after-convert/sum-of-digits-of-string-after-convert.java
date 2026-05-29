class Solution {
    public int getLucky(String s, int k) {
        
        int sum = 0;

        // Convert characters to numbers and add their digits
        for (char ch : s.toCharArray()) {
            int val = ch - 'a' + 1;

            // If number has 2 digits (like 26)
            sum += val / 10;
            sum += val % 10;
        }

        // Perform remaining transformations
        for (int i = 1; i < k; i++) {
            int temp = 0;

            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }

            sum = temp;
        }

        return sum;
    }
}