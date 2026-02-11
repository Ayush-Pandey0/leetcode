class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, new StringBuilder(), map, res);
        return res;
    }

    void backtrack(int idx, String digits, StringBuilder cur,
                   String[] map, List<String> res) {

        if (idx == digits.length()) {
            res.add(cur.toString());
            return;
        }


        

        String letters = map[digits.charAt(idx) - '0'];
        for (char c : letters.toCharArray()) {
            cur.append(c);
            backtrack(idx + 1, digits, cur, map, res);
            cur.deleteCharAt(cur.length() - 1); 
        }
    }
}
