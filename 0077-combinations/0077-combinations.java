import java.util.*;

class Solution {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> list = new ArrayList<>();

        fun(1, n, k, new ArrayList<>(), list);

        return list;
    }

    static void fun(int start, int n, int k,
                    List<Integer> temp,
                    List<List<Integer>> list) {

        // Base case
        if (temp.size() == k) {
            list.add(new ArrayList<>(temp));
            return;
        }

        // Try every number
        for (int i = start; i <= n; i++) {

            // Choose
            temp.add(i);

            // Recursion
            fun(i + 1, n, k, temp, list);

            // Backtrack
            temp.remove(temp.size() - 1);
        }
    }
}