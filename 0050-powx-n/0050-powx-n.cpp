class Solution {
public:
    unordered_map<long long, double> dp;

    double pow(double x, long long n) {
        if (n == 0) return 1;

        if (dp.count(n)) return dp[n];  

        return dp[n] = x * pow(x, n - 1); 
    }

    double myPow(double x, int n) {
        long long N = n;
        if (N < 0) {
            x = 1.0 / x;
            N = -N;
        }
        return pow(x, N);
    }
};
