class Solution {

    static boolean fun(int day, int[] bloomDay, int m, int k) {
        int flowers = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length)
            return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int x : bloomDay) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        int ans = -1;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (fun(mid, bloomDay, m, k)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return ans;
    }
}