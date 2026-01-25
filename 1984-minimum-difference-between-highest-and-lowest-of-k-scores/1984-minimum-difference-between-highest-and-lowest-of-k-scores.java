class Solution {
    public int minimumDifference(int[] arr, int k) { 
       Arrays.sort(arr);
       int n = arr.length;
       if (n==1) return 0;
       int i =n-k;
       int j=n-1;
       int diff1= Integer.MAX_VALUE;
       while(i>=0){
        int cm= arr[j]-arr[i];
        diff1=Math.min(diff1,cm);
        i--;
        j--;
       }
       return diff1;
    }
}