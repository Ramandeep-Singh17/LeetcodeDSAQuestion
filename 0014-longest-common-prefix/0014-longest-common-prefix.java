class Solution {
    public String longestCommonPrefix(String[] s) {
       Arrays.sort(s);
       String s1 = s[0];
       String s2 = s[s.length-1] ;
       String ans="";
       for(int i =0;i<s1.length();i++){
        if(i>s2.length()||s1.charAt(i)!=s2.charAt(i)){
             break;
        }
        ans=ans+s1.charAt(i);
       }
       return ans;
    }
}