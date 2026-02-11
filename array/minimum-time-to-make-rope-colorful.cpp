class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int totalTime = 0;
        int n = colors.size();
        
        for (int i = 1; i < n; i++) {
            // If two adjacent balloons have the same color
            if (colors[i] == colors[i - 1]) {
                // Remove the one that takes less time
                totalTime += min(neededTime[i], neededTime[i - 1]);
                
                // Keep the one with higher time (since we removed smaller one)
                neededTime[i] = max(neededTime[i], neededTime[i - 1]);
            }
        }
        return totalTime;
    }
};
