class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] window = new int[26];

        // Frequency of characters in p
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to window
            window[s.charAt(right) - 'a']++;

            // Shrink window if its size becomes greater than p.length()
            if (right - left + 1 > p.length()) {
                window[s.charAt(left) - 'a']--;
                left++;
            }

            // If frequencies match, it is an anagram
            if (Arrays.equals(window, pFreq)) {
                ans.add(left);
            }
        }

        return ans;
    }
}