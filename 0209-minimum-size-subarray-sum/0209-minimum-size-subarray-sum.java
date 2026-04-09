class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int  low =0;
        int high=0;
        int res= Integer.MAX_VALUE;
        int sum =0;
        int n = arr.length-1;
        int size=0;
        while(high<=n){
            sum=sum+arr[high];
            while(sum>=target){
                 size = high - low + 1;
                 sum = sum - arr[low];
                 res = Math.min(res, size);
                 low++;
                
            }
            high++;// jaise sum chota hua add karo
            
        }
      if (res == Integer.MAX_VALUE) {
    return 0;
} else {
    return res;
}
    }
}