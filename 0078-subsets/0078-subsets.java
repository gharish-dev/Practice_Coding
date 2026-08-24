import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        fun(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    static void fun(int index, int[] nums,
                    List<Integer> curr,
                    List<List<Integer>> ans) {

        // Base case
        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // PICK
        curr.add(nums[index]);
        fun(index + 1, nums, curr, ans);

        // BACKTRACK
        curr.remove(curr.size() - 1);

        // NOT PICK
        fun(index + 1, nums, curr, ans);
    }
}