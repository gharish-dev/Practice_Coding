class Solution {
    public int splitArray(int[] nums, int k) {

        int max = 0;
        int sum = 0;

        for (int x : nums) {
            max = Math.max(max, x);
            sum += x;
        }

        int left = max;
        int right = sum;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canSplit(int[] nums, int k, int limit) {

        int subarr = 1;
        int currSum = 0;

        for (int x : nums) {

            if (currSum + x <= limit) {
                currSum += x;
            } else {
                subarr++;
                currSum = x;
            }
        }

        return subarr <= k;
    }
}