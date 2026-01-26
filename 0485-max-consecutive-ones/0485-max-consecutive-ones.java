class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        int count =0;
        for(int i =0;i<n;i++) {
            if(arr[i]==1)
              count++;
            max=Math.max(max,count);
            if(arr[i]==0) 
               count=0;
        }     
        return max ;
    }
}