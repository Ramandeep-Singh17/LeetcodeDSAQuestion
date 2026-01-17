class Solution {
    public double myPow(double a, int b) {

        long n = b;
        double ans = 1.0;

        if (n < 0) {
            a = 1 / a;
            n = -n;
        }

        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * a;
            }
            a = a * a;
            n = n / 2;
        }

        return ans;
    }
}

