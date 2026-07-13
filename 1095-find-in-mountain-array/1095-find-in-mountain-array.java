/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = findPeak(mountainArr);

        // Search in ascending part
        int ans = binarySearch(mountainArr, target, 0, peak, true);
        if (ans != -1) {
            return ans;
        }

        // Search in descending part
        return binarySearch(mountainArr, target, peak + 1,
                            mountainArr.length() - 1, false);
    }

    // Find peak index
    private int findPeak(MountainArray mountainArr) {
        int l = 0;
        int r = mountainArr.length() - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }

    // Binary Search
    private int binarySearch(MountainArray mountainArr, int target,
                             int l, int r, boolean ascending) {

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int value = mountainArr.get(mid);

            if (value == target) {
                return mid;
            }

            if (ascending) {
                if (value < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                // Descending order
                if (value < target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        return -1;
    }
}