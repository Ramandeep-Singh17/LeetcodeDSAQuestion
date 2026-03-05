class Solution {
     public int longestConsecutive(int[] nums) {
        HashSet< Integer > st = new HashSet<>();
      for(int num:nums){
          st.add(num);
      }
      int maxlen=0;
      for(int num:st){
          if(!st.contains(num-1)){// num is starting point
            int currNum=num;
            int currlen=1;
            while(st.contains(currNum+1)){
                currlen++;
                currNum++;
            }
            maxlen=Math.max(currlen,maxlen);
          }
      }
      return maxlen;
    }
}