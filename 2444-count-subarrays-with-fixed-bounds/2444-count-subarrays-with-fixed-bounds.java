class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        long ans = 0;

        int lastMin = -1;
        int lastMax = -1;
        int bad = -1;

        for (int i = 0; i < nums.length; i++) {

            // Number is outside allowed range
            if (nums[i] < minK || nums[i] > maxK) {
                bad = i;
            }

            // Last occurrence of minK
            if (nums[i] == minK) {
                lastMin = i;
            }

            // Last occurrence of maxK
            if (nums[i] == maxK) {
                lastMax = i;
            }

            // Count valid subarrays ending at i
            ans += Math.max(0, Math.min(lastMin, lastMax) - bad);
        }

        return ans;
    }
}