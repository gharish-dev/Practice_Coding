class Solution {

    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;

        for (int i = 0; i < nums1.length; i++) {
            ans = Math.max(ans, binarySearch(nums1[i], nums2, i));
        }

        return ans;
    }

    private int binarySearch(int target, int[] nums2, int start) {
        int l = start;
        int r = nums2.length - 1;
        int best = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums2[mid] >= target) {
                best = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return (best == -1) ? 0 : best - start;
    }
}