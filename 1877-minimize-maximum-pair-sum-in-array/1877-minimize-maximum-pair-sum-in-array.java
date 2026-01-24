class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int i =0; 
         int j =n-1; 
           int sum1=0;
        while(i<j){
           int  sum=arr[i]+arr[j];
           sum1= Math.max(sum,sum1);
           i++;
           j--;
        }
        return sum1;
        
    }
}