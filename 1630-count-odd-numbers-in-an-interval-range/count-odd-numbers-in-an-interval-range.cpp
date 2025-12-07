class Solution {
public:
    int countOdds(int low, int high) {
        // If both low and high are even, odds = (high - low) / 2
        // Else odds = (high - low) / 2 + 1
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        } else {
            return (high - low) / 2 + 1;
        }
    }
};
