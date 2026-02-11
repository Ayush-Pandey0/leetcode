class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
        vector<int> result;
        if (words.empty() || s.empty()) return result;

        int wordLen = words[0].size();
        int wordCount = words.size();
        int totalLen = wordLen * wordCount;

        if (s.size() < totalLen) return result;

        unordered_map<string, int> wordMap;
        for (auto &w : words)
            wordMap[w]++;

        // Try starting from each index within wordLen range
        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i, count = 0;
            unordered_map<string, int> seen;

            while (right + wordLen <= s.size()) {
                string word = s.substr(right, wordLen);
                right += wordLen;

                if (wordMap.count(word)) {
                    seen[word]++;
                    count++;

                    // If word count exceeds expected, move left pointer
                    while (seen[word] > wordMap[word]) {
                        string leftWord = s.substr(left, wordLen);
                        seen[leftWord]--;
                        left += wordLen;
                        count--;
                    }

                    // If all words matched
                    if (count == wordCount)
                        result.push_back(left);
                } 
                else {
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
};
