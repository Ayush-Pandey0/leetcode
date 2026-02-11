class Solution {
public:
    vector<long long> sumOfThree(long long num) {
        vector<long long> v;

        // Check if num can be divided equally into 3 consecutive numbers
        if (num % 3 != 0) {
            return {}; // return empty vector if not possible
        }

        long long mid = num / 3;

        // The three consecutive numbers will be (mid-1, mid, mid+1)
        v.push_back(mid - 1);
        v.push_back(mid);
        v.push_back(mid + 1);

        return v;
    }
};
