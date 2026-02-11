class Solution {
    public int distMoney(int money, int children) {
        // Step 1: Give each child $1
        money -= children;
        if (money < 0) return -1; // Not enough money for everyone

        // Step 2: Give $7 more to as many children as possible
        int count = Math.min(money / 7, children);
        money -= count * 7;

        // Step 3: Handle special cases
        // Case A: All children got $8 but still have leftover money
        if (count == children && money > 0) return count - 1;
        // Case B: Exactly one child left and remaining money is 3 -> would make that child get $4
        if (count < children && money == 3 && children - count == 1) return count - 1;

        return count;
    }
}
