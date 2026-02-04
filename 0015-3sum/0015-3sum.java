// class Solution {
//     public List<List<Integer>> threeSum(int[] arr,int n) {
//           Arrays.sort(arr);
//           List<List<Integer> ans= new ArrayList<>();
//           for(int i =0;i<n;i++){
//             if(i>0 && arr[i]==arr[i-1]) continue;
//           }
//           int left=i+1;
//           int right=n-1;
//           while(left<right){
//             int sum=arr[i]+arr[left]+arr[right];
//             if(sum ==0){
//                 ans.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                 left++;
//                 right--;

//                 while(left<right&&arr[left]==arr[left-1])
//                 left++;
//                 while(left<right&&arr[right]==arr[right+1]) right--;
//             }
//             else if (sum<0) left++;
//             else right--;
//           }
//         }
//         return ans;
//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        int n = arr.length;   // yahin n nikal lo
        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);
                    ans.add(temp);
                 // Arrays.asList ke jagah
                 // arrays,List ka kaam = integers ko ek List me convert karta hai;
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return ans;
    }
}
