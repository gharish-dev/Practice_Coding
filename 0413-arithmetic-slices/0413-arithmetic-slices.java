class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        int n = nums.length;

        if (n < 3) {
            return 0;
        }

        int left = 0;
        int ans = 0;

        for (int right = 2; right < n; right++) {

            // Check whether the current window is arithmetic
            if (nums[right] - nums[right - 1] !=
                nums[right - 1] - nums[right - 2]) {

                // Arithmetic window breaks
                left = right - 1;
            }

            // Window [left ... right] is arithmetic
            int len = right - left + 1;

            if (len >= 3) {
                ans += len - 2;
            }
        }

        return ans;
    }
}