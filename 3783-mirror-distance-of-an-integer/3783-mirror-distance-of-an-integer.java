class Solution {
    public int mirrorDistance(int n) {
        int copy = n;
        int rev = 0;
        
        while(n > 0){
            int LD = n % 10;
            rev = rev * 10 + LD;
            n = n / 10;
        }
        
        return Math.abs(copy - rev);
    }
}