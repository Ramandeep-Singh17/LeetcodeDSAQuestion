class Solution {
    public int Max(int[] a){
        int maxcnt=-1;
        for(int i =0;i<256;i++){
            maxcnt=Math.max(maxcnt,a[i]);
        }
        return maxcnt;
    }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freqArray= new int[256];
        int low=0;
        int high=0;
        int result=Integer.MIN_VALUE;


        for(high =0;high<n;high++){
            char ch =s.charAt(high);
            //freqArray[s.cha]
            freqArray[ch]++;


            int maxcnt=Max(freqArray);
            int len= high-low+1;
            int diff= len-maxcnt;


            while(diff>k){
                freqArray[s.charAt(low)]--;
                low++;

                  maxcnt=Max(freqArray);
                  len= high-low+1;
                  diff= len-maxcnt;
            }
            // while jatak diff>k ab yaha se dff<=k ho jayega

            len = high-low+1;
            result=Math.max(result,len) ;
        }

       return result; 
    }
}