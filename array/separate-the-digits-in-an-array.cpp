class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        vector<int> arr; // To store the separated digits
        
        for (int num : nums) {
            if (num == 0) {
                arr.push_back(0);
                continue;
            }

            int divisor = 1;
            while (num / divisor >= 10) {
                divisor *= 10; // Find the largest divisor for the number
            }

            // Extract digits from left to right using divisor
            while (divisor > 0) {
                arr.push_back(num / divisor);
                num %= divisor; // Remove the leading digit
                divisor /= 10;  // Reduce divisor to extract the next digit
            }
        }
        
        return arr;
    }
};
