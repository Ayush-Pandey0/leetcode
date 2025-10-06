class Solution {
public:
    int countPrimes(int n) {
        if (n <= 2) return 0; // handle small cases
        
        vector<bool> m(n, true);
        m[0] = m[1] = false;

        for (int i = 2; i <= n / i; i++) {
            if (m[i]) {
                for (int j = i * i; j < n; j += i) {
                    m[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (m[i]) count++;
        }
        return count;
    }
};
