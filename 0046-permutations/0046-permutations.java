class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];

        fun(nums, new ArrayList<>(), visited, ans);

        return ans;
    }

    static void fun(int[] nums,
                    List<Integer> list,
                    boolean[] visited,
                    List<List<Integer>> ans) {

        // Base case
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // Try every number
        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) {
                continue;
            }

            // choose
            list.add(nums[i]);
            visited[i] = true;

            // recursion
            fun(nums, list, visited, ans);

            // undo
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}