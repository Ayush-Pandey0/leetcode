import java.util.*;

class Solution {
    public int evaluate(String expression) {
        return eval(expression, new HashMap<>());
    }

    private int eval(String expr, Map<String, Deque<Integer>> scope) {
        if (expr.charAt(0) != '(') {
            // If it's a number
            if (Character.isDigit(expr.charAt(0)) || expr.charAt(0) == '-')
                return Integer.parseInt(expr);
            // If it's a variable
            return scope.get(expr).peek();
        }

        // Remove outer parentheses
        String s = expr.substring(1, expr.length() - 1);
        String[] tokens = parseTokens(s);
        String op = tokens[0];

        if (op.equals("let")) {
            // Each let expression introduces a new scope
            Map<String, Deque<Integer>> newScope = new HashMap<>();
            for (String key : scope.keySet()) {
                newScope.put(key, new ArrayDeque<>(scope.get(key)));
            }

            // Process pairs (var, expr) until the last expression
            for (int i = 1; i < tokens.length - 1; i += 2) {
                String var = tokens[i];
                int val = eval(tokens[i + 1], newScope);
                newScope.putIfAbsent(var, new ArrayDeque<>());
                newScope.get(var).push(val);
            }

            // Last token is the return expression
            return eval(tokens[tokens.length - 1], newScope);

        } else if (op.equals("add")) {
            return eval(tokens[1], scope) + eval(tokens[2], scope);

        } else if (op.equals("mult")) {
            return eval(tokens[1], scope) * eval(tokens[2], scope);
        }

        return 0; // should never reach
    }

    // Helper to split top-level tokens correctly (handles nested parentheses)
    private String[] parseTokens(String s) {
        List<String> tokens = new ArrayList<>();
        int level = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') level++;
            if (c == ')') level--;
            if (c == ' ' && level == 0) {
                tokens.add(sb.toString());
                sb.setLength(0);
            } else {
                if (!(c == ' ' && level == 0)) sb.append(c);
            }
        }
        tokens.add(sb.toString());
        return tokens.toArray(new String[0]);
    }
}
