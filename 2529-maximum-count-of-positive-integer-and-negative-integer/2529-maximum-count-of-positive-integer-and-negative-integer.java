class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // First index where nums[i] >= 0
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        int negative = l;

        // First index where nums[i] > 0
        l = 0;
        r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        int positive = n - l;

        return Math.max(negative, positive);
    }
}