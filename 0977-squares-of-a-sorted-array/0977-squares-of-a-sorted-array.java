// class Solution {
//     public int[] sortedSquares(int[] arr) {
//       int n =arr.length;
//       int[] nums = new int[n];
//       for (int i=0;i<n;i++){
//             nums[i]=arr[i]*arr[i] ;     
//       }
//       Arrays.sort(nums);
//       return nums;
//     }
// }
class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int i =0;
        int j = n-1;
        int idx= n-1;
        int[] ans= new int[n]; 
        while(i<=j){
            if(arr[i]*arr[i]<arr[j]*arr[j]){
                ans[idx]=arr[j]*arr[j];
                    j--;
            }
            else{//arr[i]>arr[j]
                ans[idx]=arr[i]*arr[i];
                i++;
            }
            idx--;
        }
        return ans;
    }
}