class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            int lower = 0;
            int upper = 0;

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);

                if (Character.isLowerCase(ch))
                    lower |= 1 << (ch - 'a');
                else
                    upper |= 1 << (ch - 'A');

                if (lower == upper && (j - i + 1) > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }

        return ans;
    }
}