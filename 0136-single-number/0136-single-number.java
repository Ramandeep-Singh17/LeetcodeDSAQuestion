class Solution {
    public int singleNumber(int[] arr) {
      int n = arr.length;
      if(n==1) return arr[0];
      int i=0;
      Arrays.sort(arr);
      for( i =1;i<n;i=i+2){
        if(arr[i-1]==arr[i])
         continue;
        else if(arr[i-1]!=arr[i]) 
        return arr[i-1];
         else if(arr[n-1]!=arr[n-2])
        return arr[n-1];
        
      }  
      return arr[i-1];      
    }
}
