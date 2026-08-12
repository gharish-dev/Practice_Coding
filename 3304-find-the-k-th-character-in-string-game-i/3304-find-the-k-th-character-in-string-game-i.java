class Solution {
    public char kthCharacter(int k) {
        return solve(k);
    }

    static char solve(int k) {

        // Base case
        if (k == 1) {
            return 'a';
        }

        // Find the largest power of 2 less than k
        int n = 1;

        while (n * 2 < k) {
            n *= 2;
        }

        if (k <= n) {
            return solve(k);
        }

        return (char)(solve(k - n) + 1);
    }
}