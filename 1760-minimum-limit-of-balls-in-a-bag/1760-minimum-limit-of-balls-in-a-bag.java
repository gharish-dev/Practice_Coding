class Solution {

    public int minimumSize(int[] nums, int maxOperations) {

        int l = 1;
        int r = 0;

        for (int num : nums) {
            r = Math.max(r, num);
        }

        int ans = r;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (canMake(nums, maxOperations, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private boolean canMake(int[] nums, int maxOperations, int penalty) {

        long operations = 0;

        for (int num : nums) {
            operations += (num - 1) / penalty;
        }

        return operations <= maxOperations;
    }
}