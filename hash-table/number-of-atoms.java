import java.util.*;

class Solution {
    int i; // global index

    public String countOfAtoms(String formula) {
        i = 0;
        Map<String, Integer> map = parse(formula);
        // Sort by atom name
        TreeMap<String, Integer> sorted = new TreeMap<>(map);
        StringBuilder res = new StringBuilder();
        for (String atom : sorted.keySet()) {
            res.append(atom);
            int count = sorted.get(atom);
            if (count > 1) res.append(count);
        }
        return res.toString();
    }

    // Recursive function to parse part of the formula
    private Map<String, Integer> parse(String s) {
        Map<String, Integer> map = new HashMap<>();
        int n = s.length();
        while (i < n && s.charAt(i) != ')') {
            char c = s.charAt(i);
            if (c == '(') {
                i++; // skip '('
                Map<String, Integer> inner = parse(s); // parse inside
                i++; // skip ')'
                int num = getNum(s); // get multiplier
                for (String key : inner.keySet()) {
                    map.put(key, map.getOrDefault(key, 0) + inner.get(key) * num);
                }
            } else {
                // Parse element name
                String name = getName(s);
                int num = getNum(s);
                map.put(name, map.getOrDefault(name, 0) + num);
            }
        }
        return map;
    }

    // Parse atom name like "Mg" or "O"
    private String getName(String s) {
        StringBuilder name = new StringBuilder();
        name.append(s.charAt(i++)); // uppercase
        while (i < s.length() && Character.isLowerCase(s.charAt(i))) {
            name.append(s.charAt(i++));
        }
        return name.toString();
    }

    // Parse number after element or parentheses
    private int getNum(String s) {
        int n = s.length(), num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i++) - '0');
        }
        return num == 0 ? 1 : num;
    }
}
