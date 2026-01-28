class Solution {
    public boolean isPowerOfThree(int n) {
        // ye dono base case hai
      if (n==1) return true;
      if (n<=0 || n%3!=0)  return false;
      //main code 
      return isPowerOfThree(n/3);
      // baar baar 3 se divide hota rahega
    }
}