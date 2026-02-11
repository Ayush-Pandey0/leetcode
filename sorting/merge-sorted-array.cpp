class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> vec;  // Temporary vector

        // Copy first m elements from nums1
        for (int i = 0; i < m; i++) {
            vec.push_back(nums1[i]);
        }

        // Copy first n elements from nums2 (Fixed the loop condition)
        for (int i = 0; i < n; i++) {
            vec.push_back(nums2[i]);
        }

        // Sort the merged vector
        sort(vec.begin(), vec.end());

        // Copy sorted elements back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = vec[i];
        }
    }
};
