class Solution {

    public List<List<Integer>> combinationSum2(
        int[] candidates,
        int target
    ) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(
            candidates,
            target,
            0,
            new ArrayList<>(),
            result
        );

        return result;
    }

    void backtrack(
        int[] candidates,
        int target,
        int start,
        List<Integer> path,
        List<List<Integer>> result
    ) {

        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Skip duplicate choices at same level
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since sorted, no later number can work
            if (candidates[i] > target) {
                break;
            }

            // choose
            path.add(candidates[i]);

            // i + 1 means:
            // cannot reuse this element
            backtrack(
                candidates,
                target - candidates[i],
                i + 1,
                path,
                result
            );

            // undo
            path.remove(path.size() - 1);
        }
    }
}