import java.util.*;

class Solution {

    public int countVowelSubstrings(String word) {
        return atMost(word, 5) - atMost(word, 4);
    }

    private int atMost(String word, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;

        for (int right = 0; right < word.length(); right++) {
            char ch = word.charAt(right);

            // Reset window if consonant
            if (!isVowel(ch)) {
                map.clear();
                left = right + 1;
                continue;
            }

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char c = word.charAt(left);
                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0)
                    map.remove(c);

                left++;
            }

            ans += right - left + 1;
        }

        return ans;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}