class Solution {
    public String decodeString(String s) {

        Stack<Integer> number = new Stack<>();
        Stack<Character> input = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder t = new StringBuilder();
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else {
                if (c == '[') {
                    number.push(num);
                    num = 0;          // ✅ FIX
                    input.push('[');  // ✅ FIX
                }
                else if (c == ']') {

                    while (input.peek() != '[') {
                        t.append(input.pop());
                    }
                    input.pop();      // remove '['
                    t.reverse();

                    int times = number.pop();

                    while (times-- > 0) {
                        for (char ch : t.toString().toCharArray()) {
                            input.push(ch);
                        }
                    }
                }
                else {
                    input.push(c);
                }
            }
        }

        for (char ch : input) sb.append(ch);
        return sb.toString();
    }
}
