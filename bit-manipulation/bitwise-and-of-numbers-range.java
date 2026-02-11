class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // Iterate until left equals right
        while (left < right) {
            right = right & (right - 1); // Remove the least significant bit of right
        }
        return left & right;  // This will give us the final result
    }
}
