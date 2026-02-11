class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String ans = "";
        String word = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (!word.equals("")) {
                    ans += word + " ";
                    word = "";
                }
            } else {
                word = s.charAt(i) + word;
            }
        }

        // add last word
        ans += word;

        return ans;
    }
}
