class Solution {
    public int[] runningSum(int[] arr) {
        int n = arr.length;
       int[] ans = new int [n];
        
          ans[0] = arr[0]; 
    for(int i =1;i<arr.length;i++){
        ans[i] = ans[i - 1] + arr[i];
        
    }
    return ans;
    }
}