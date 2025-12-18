class Solution {
public:
    bool canship(vector<int>& weights, int cap, int days) {
        int load = 0;
        int useddays = 1;

        for (int w : weights) {
            if (load + w > cap) {
                useddays++;
                load = 0;
            }
            load += w;
        }
        return useddays <= days;
    }

    int shipWithinDays(vector<int>& weights, int days) {
        int low = *max_element(weights.begin(), weights.end());
        int high = 0;
        for (int w : weights) high += w;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canship(weights, mid, days))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
};
