class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer>ans= new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
       // int count=0;
         for(int i =0;i<n-1;i++){
                if(arr[i]==arr[i+1]){
                  ans.add(arr[i]);
                }
             
         }

         return ans;
    }
}