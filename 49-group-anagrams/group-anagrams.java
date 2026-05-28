class Solution {

    public boolean isAnagram(String a, String b) {

        if(a.length() != b.length()) {
            return false;
        }

        int[] freq = new int[26];

        for(int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        for(int i : freq) {
            if(i != 0) {
                return false;
            }
        }

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i = 0; i < strs.length; i++) {

            if(visited[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for(int j = i + 1; j < strs.length; j++) {

                if(!visited[j] && isAnagram(strs[i], strs[j])) {

                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }

        return ans;
    }
}