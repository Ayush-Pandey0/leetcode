#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> prefixSumCount;
        prefixSumCount[0] = 1; // to handle subarrays starting at index 0

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;

            // check if (currSum - k) exists
            if (prefixSumCount.find(currSum - k) != prefixSumCount.end()) {
                count += prefixSumCount[currSum - k];
            }

            // store current prefix sum
            prefixSumCount[currSum]++;
        }

        return count;
    }
};
