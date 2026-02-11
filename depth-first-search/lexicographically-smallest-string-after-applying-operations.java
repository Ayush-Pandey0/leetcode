import java.util.*;

class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Queue<String> queue = new LinkedList<>();
        Set<String> seen = new HashSet<>();
        String smallest = s;

        queue.add(s);
        seen.add(s);

        while (!queue.isEmpty()) {
            String cur = queue.poll();
            if (cur.compareTo(smallest) < 0) {
                smallest = cur;
            }

            // Operation 1: add 'a' to all odd indices
            String added = addOperation(cur, a);
            if (seen.add(added)) {
                queue.add(added);
            }

            // Operation 2: rotate by 'b'
            String rotated = rotateOperation(cur, b);
            if (seen.add(rotated)) {
                queue.add(rotated);
            }
        }

        return smallest;
    }

    // Add 'a' to all digits at odd indices
    private String addOperation(String s, int a) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            int num = (chars[i] - '0' + a) % 10;
            chars[i] = (char) (num + '0');
        }
        return new String(chars);
    }

    // Rotate string to the right by 'b' positions
    private String rotateOperation(String s, int b) {
        int n = s.length();
        return s.substring(n - b) + s.substring(0, n - b);
    }
}
