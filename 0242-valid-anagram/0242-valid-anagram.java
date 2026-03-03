//   class Solution {
//     public static boolean isAnagram(String s1, String s2) {
//         if(s1.length()!=s2.length()) return false;
//         char[]arr1=s1.toCharArray();
//         char[]arr2=s2.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         for(int i=0;i<arr1.length;i++){
//             if(arr1[i]!=arr2[i]) return false;
//         }
//         return true;
//     }
// }
        
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>mp1=makeFreqMap(s);
        HashMap<Character,Integer>mp2=makeFreqMap(t);
        return mp1.equals(mp2);
    }
    static HashMap<Character,Integer> makeFreqMap(String str){
       HashMap<Character,Integer> mp = new HashMap<>();
        for(int i =0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int currFreq= mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp  ;
    }
}
