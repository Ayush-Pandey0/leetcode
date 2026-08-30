class Solution {
    public int minimumDeletions(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        if (nums.length == 1) {
            return 1;
        }
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        System.out.println(max + " " + min);

        int n = nums.length;
        int minIndex = n;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == min) {
                minIndex = i + 1;
            }
            if (nums[i] == max) {
                maxIndex = i + 1;
            }
        }
        System.out.println(maxIndex + " " + minIndex);


        int left=Math.max(minIndex,maxIndex);
        int right=Math.max(n-minIndex+1,n-maxIndex+1);

        int both1=minIndex+(n-maxIndex+1);
        int both2=maxIndex+(n-minIndex+1);
        int both=Math.min(both1,both2);
        return Math.min(left,Math.min(right,both));


        // if (minIndex <= (n + 1) / 2 && maxIndex <= (n + 1) / 2) {
        //     return Math.max(minIndex, maxIndex);
        // }


        // int minRight =  n - minIndex + 1;
        // int maxRight =  n - maxIndex + 1;


        // if (minRight <= (n + 1) / 2 && maxRight <= (n + 1) / 2) {
        //     return Math.max(minRight, maxRight);
        // }

        // return Math.min(left,Math.min(
        //     minIndex + maxRight,
        //     maxIndex + minRight
        // ));
    }
}