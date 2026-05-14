// my approach but failed

// class Solution {
//     public boolean isGood(int[] nums) {
//      Arrays.sort(nums);
//      int n = nums.length;
//      int largest= nums[n-1];
//      if(n<2) return false;
//      int res= (largest)*(largest-1)/2;
//      int sum = 0;
//      for(int i =0;i<n-2;i++){
//         sum =sum+ nums[i];
//      }
//       if (sum!= res) return false;
//      else if (nums[n-1]!=nums[n-2])
//        return false;
//        else    
//       return true; 
//     }
// }

class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        if(n < 2) return false;

        if(nums[n-1] != nums[n-2]){
            return false;
        }

       
        for(int i = 0; i < n-1; i++){
            if(nums[i] != i+1){
                return false;
            }
        }

        return true;
    }
}