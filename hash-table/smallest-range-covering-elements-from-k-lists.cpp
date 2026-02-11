class Solution {
public:
    vector<int> smallestRange(vector<vector<int>>& nums) {
        int k = nums.size();

        // Min-heap: {value, list_index, element_index}
        priority_queue<vector<int>, vector<vector<int>>, greater<vector<int>>> minHeap;

        int currentMax = INT_MIN;
        // Initialize heap with first element of each list
        for (int i = 0; i < k; i++) {
            minHeap.push({nums[i][0], i, 0});
            currentMax = max(currentMax, nums[i][0]);
        }

        int rangeStart = 0, rangeEnd = INT_MAX;

        while (true) {
            auto top = minHeap.top();
            minHeap.pop();
            int val = top[0];
            int listIdx = top[1];
            int elemIdx = top[2];

            // Update smallest range
            if (currentMax - val < rangeEnd - rangeStart) {
                rangeStart = val;
                rangeEnd = currentMax;
            }

            // Move to next element in same list
            if (elemIdx + 1 == nums[listIdx].size())
                break;  // one list is exhausted

            int nextVal = nums[listIdx][elemIdx + 1];
            minHeap.push({nextVal, listIdx, elemIdx + 1});
            currentMax = max(currentMax, nextVal);
        }

        return {rangeStart, rangeEnd};
    }
};
