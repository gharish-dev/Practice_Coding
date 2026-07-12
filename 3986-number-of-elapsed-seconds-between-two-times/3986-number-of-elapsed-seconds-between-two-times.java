class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        String[] st = startTime.split(":");
        String[] en = endTime.split(":");

        int ans = 0;
        int i = 0;

        int diff = Integer.parseInt(en[i]) - Integer.parseInt(st[i]);
        ans += diff * 60 * 60;
        i++;

        diff = Integer.parseInt(en[i]) - Integer.parseInt(st[i]);
        ans += diff * 60;
        i++;

        diff = Integer.parseInt(en[i]) - Integer.parseInt(st[i]);
        ans += diff;

        return ans;
    }
}