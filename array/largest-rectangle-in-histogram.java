import java.util.*;

class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;

        int[] nextsmaller = new int[n];
        Stack<Integer> stack = new Stack<>();

        // next smaller element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && h[i] <= h[stack.peek()]) {
                stack.pop();
            }
            nextsmaller[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        int[] prevsmaller = new int[n];
        Stack<Integer> stack2 = new Stack<>();

        // previous smaller element
        for (int i = 0; i < n; i++) {
            while (!stack2.isEmpty() && h[i] <= h[stack2.peek()]) {
                stack2.pop();
            }
            prevsmaller[i] = stack2.isEmpty() ? -1 : stack2.peek();
            stack2.push(i);
        }

        int maxArea = 0;

        // calculate area
        for (int i = 0; i < n; i++) {
            int width = nextsmaller[i] - prevsmaller[i] - 1;
            int area = h[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
