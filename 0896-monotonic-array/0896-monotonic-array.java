class Solution {
    public boolean isMonotonic(int[] nums) {

        int n = nums.length;
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}
