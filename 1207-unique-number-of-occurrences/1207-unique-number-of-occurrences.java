class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i =1;i<n;i++){
            if(arr[i-1]==arr[i]) {
                count++;           
            }
            else {
                ans.add(count); 
                count=1;
              }
        }
        ans.add(count);
  Collections.sort(ans);
    for (int i = 0; i < ans.size() - 1; i++) {
       if (ans.get(i).equals(ans.get(i + 1))) {
        return false;
    }
}
return true;    
    }
}