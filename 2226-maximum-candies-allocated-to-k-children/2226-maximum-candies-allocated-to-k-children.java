class Solution {

    public int maximumCandies(int[] candies, long k) {

        int max = 0;
        for (int pile : candies) {
            max = Math.max(max, pile);
        }

        int l = 1;
        int r = max;
        int ans = 0;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (canDistribute(candies, mid, k)) {
                ans = mid;
                l = mid + 1;      // try larger answer
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }

    private boolean canDistribute(int[] candies, int x, long k) {

        long children = 0;

        for (int pile : candies) {
            children += pile / x;

            if (children >= k) {
                return true;
            }
        }

        return false;
    }
}