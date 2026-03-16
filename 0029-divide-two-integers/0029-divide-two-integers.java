class Solution {
    public int divide(int x, int y) {
         if(x == Integer.MIN_VALUE && y == -1){
            return Integer.MAX_VALUE;
        }
        return x/y;
    }
}