import java.util.*;

class TimeMap {

    class Pair {
        int timestamp;
        String value;

        Pair(int t, String v) {
            timestamp = t;
            value = v;
        }
    }

    HashMap<String, ArrayList<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key))
            return "";

        ArrayList<Pair> list = map.get(key);

        int l = 0;
        int r = list.size() - 1;

        String ans = "";

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (list.get(mid).timestamp <= timestamp) {
                ans = list.get(mid).value;   // possible answer
                l = mid + 1;                 // search for a later valid timestamp
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}