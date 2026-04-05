class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int closestSum= arr[0]+arr[1]+arr[2];
            
        for(int i =0;i<n;i++){
             if (i > 0 && arr[i] == arr[i - 1]) {
                        continue;
            }
            int left= i+1;
            int right= n-1;
            while(left<right){
                 int sum = arr[i]+arr[left]+arr[right];

               if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                else if (sum<target){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return closestSum;
    }         
}

// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int n = nums.length;

//         int closestSum = nums[0] + nums[1] + nums[2]; // initial

//         for (int i = 0; i < n - 2; i++) {

//             int left = i + 1;
//             int right = n - 1;

//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right];

//                 // update closest
//                 if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
//                     closestSum = sum;
//                 }

//                 if (sum < target) {
//                     left++;
//                 } 
//                 else if (sum > target) {
//                     right--;
//                 } 
//                 else {
//                     return sum; // exact match
//                 }
//             }
//         }

//         return closestSum;
//     }
// }