import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] copy = arr.clone();   // copy original array
        Arrays.sort(copy);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        // Store rank for each unique value
        for (int num : copy) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        // Replace values with ranks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}