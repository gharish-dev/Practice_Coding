import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }

        int[] ans = new int[set.size()];
        int i = 0;

        for (int x : set) {
            ans[i++] = x;
        }

        return ans;
    }

    private boolean binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}