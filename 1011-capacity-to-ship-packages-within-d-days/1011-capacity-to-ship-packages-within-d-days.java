class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int sum = 0;

        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }

        int left = max;
        int right = sum;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid - 1;   // Try a smaller capacity
            } else {
                left = mid + 1;    // Need a larger capacity
            }
        }

        return left;
    }

    private boolean canShip(int[] weights, int days, int capacity) {

        int daysUsed = 1;
        int currentLoad = 0;

        for (int w : weights) {

            if (currentLoad + w <= capacity) {
                currentLoad += w;
            } else {
                daysUsed++;
                currentLoad = w;

                if (daysUsed > days) {
                    return false;
                }
            }
        }

        return true;
    }
}