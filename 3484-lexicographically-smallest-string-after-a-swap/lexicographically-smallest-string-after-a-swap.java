class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int a = arr[i] - '0';
            int b = arr[i + 1] - '0';

            // Check same parity
            if (a % 2 == b % 2 && arr[i] > arr[i + 1]) {
                // Swap to make string smaller
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                break; // only one swap allowed
            }
        }

        return new String(arr);
    }
}
