class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
     int copy= x;
     int reverseNum=0;
     while (copy!=0){
      int lastDigit= copy%10;
      reverseNum =reverseNum*10+ lastDigit;
      copy=copy/10;
    }
    if (x==reverseNum){
    return true;}
   else{
    return false;
   } 
}}