class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        int n = arr.length;
        int m =(1<<n);//2 raised to power n
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<m;i++){
        List<Integer>a = new ArrayList<>();
        for(int j =0;j<n;j++){
            if((i>>j)%2==1)a.add(arr[j]);
        }
        result.add(a);
        }
        return result;
    }
}
// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         subsets(new ArrayList<>(), nums, 0, result);
//         return result;
//     }

//     private void subsets(List<Integer> ans, int[] nums, int idx, List<List<Integer>> result) {
//         if (idx == nums.length) {
//             result.add(new ArrayList<>(ans));  // store current subset
//             return;
//         }

//         int ch = nums[idx];

//         // PICK
//         ans.add(ch);
//         subsets(ans, nums, idx + 1, result);

//         // SKIP
//         ans.remove(ans.size() - 1);
//         subsets(ans, nums, idx + 1, result);
//     }
// }
