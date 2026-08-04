class Solution {
    public int minKBitFlips(int[] nums, int k) {

        int n = nums.length;

        int[] isFlipped = new int[n];
        int flip = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            // Remove expired flip
            if (i >= k) {
                flip ^= isFlipped[i - k];
            }

            // Current bit after all active flips
            if (nums[i] == flip) {

                if (i + k > n)
                    return -1;

                ans++;

                flip ^= 1;
                isFlipped[i] = 1;
            }
        }

        return ans;
    }
}