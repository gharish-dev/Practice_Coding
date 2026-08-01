class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;

        if (n == 1) return 1;

        int left = 0;
        int maxLen = 1;

        for (int right = 1; right < n; right++) {

            int cmp = Integer.compare(arr[right - 1], arr[right]);

            if (cmp == 0) {
                // Equal elements break turbulence
                left = right;
            } 
            else if (right == n - 1 ||
                     cmp * Integer.compare(arr[right], arr[right + 1]) != -1) {

                // Current turbulent window ends here
                maxLen = Math.max(maxLen, right - left + 1);

                // Start new window from previous element
                left = right;
            }
        }

        return maxLen;
    }
}