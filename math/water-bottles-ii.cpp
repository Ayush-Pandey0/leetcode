class Solution {
public:
    int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk = 0;
        int empty = 0;

        while (numBottles > 0) {
            // Drink all full bottles
            totalDrunk += numBottles;
            empty += numBottles;
            numBottles = 0;

            // Try exchange
            if (empty >= numExchange) {
                empty -= numExchange;
                numBottles += 1;
                numExchange++;
            }
        }
        return totalDrunk;
    }
};
