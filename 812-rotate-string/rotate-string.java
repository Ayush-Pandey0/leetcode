class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        s=s+s;
        if(s.indexOf(goal)==-1) return false;
        // for (int i = 0; i < s.length(); i++) {
        //     String rotated = s.substring(i) + s.substring(0, i);
        //     if (rotated.equals(goal)) return true;
        // }
        return true;
    }
}