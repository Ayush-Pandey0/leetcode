class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 1;  // ways to reach step 1
        int b = 2;  // ways to reach step 2
        int ways = 0;

        for (int i = 3; i <= n; i++) {
            ways = a + b;  // total ways to reach step i
            a = b;         // move forward
            b = ways;
        }

        return ways;
    }
}