class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;       // number of full weeks
        int days = n % 7;        // remaining days

        // Sum for complete weeks
        // Each week starts with 1 more than the previous week
        // Formula for total of complete weeks:
        // 7 * (weeks * (weeks - 1) / 2) + 28 * weeks
        int total = 7 * weeks * (weeks - 1) / 2 + 28 * weeks;

        // Add remaining days of the last incomplete week
        for (int i = 1; i <= days; i++) {
            total += weeks + i;
        }

        return total;
    }
}
