class Solution {
    public int singleNumber(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i =0;i<n;i=i+3){
            if (i==n-1 || arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
      return -1;  
    }
}