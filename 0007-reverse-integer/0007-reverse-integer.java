// class Solution {
//     public int reverse(int x) {
//         int r = 0;
//         int copy=x;
//        if(copy<0) copy=-copy;
//         for(int i=0;copy>0;i++){
//             int v = copy%10;
//             r=r*10 + v;
//             copy/=10;
//         }
//          if(x<0)  return(-r);
//          else return(r);
//     }
// }
class Solution {
    public int reverse(int n) {
        int rev=0;
        while(n!=0){
            int dig=n%10;
               if (rev > Integer.MAX_VALUE / 10 || rev < Integer.  MIN_VALUE / 10)
                return 0;
                // hm n ko nhi rev ko dekh rhe hai isliye ise loop ke andar likhe hai.
            rev = rev*10+dig;
            n = n/10;
        }
        return rev;
    }
}