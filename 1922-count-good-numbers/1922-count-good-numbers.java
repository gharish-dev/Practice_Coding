class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans1 = power(5, even);
        long ans2 = power(4, odd);

        return (int)((ans1 * ans2) % MOD);
    }

    static long power(long x, long n) {

        if (n == 0) {
            return 1;
        }

        long half = power(x, n / 2);

        if (n % 2 == 0) {
            return (half * half) % MOD;
        }

        return (half * half % MOD * x) % MOD;
    }
}