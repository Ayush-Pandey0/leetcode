class Solution {
    public int lengthOfLastWord(String s) {
        String words[]=s.trim().split(" ");
        int len=words[words.length-1].length();
        return len;
    }
}