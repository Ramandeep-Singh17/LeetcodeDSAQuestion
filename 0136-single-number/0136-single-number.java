class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i: nums){
            res=res^i;
        }
        return res;
    }
}
// class Solution {
//     public int singleNumber(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();

//         for(int num : nums){
//             if(set.contains(num)){
//                 set.remove(num);
//             } else {
//                 set.add(num);
//             }
//         }
//         for(int num : set){
//             return num;
//         }

//         return -1;
//        // return set.iterator().next();
//     }
// }

// class Solution {
//     public int singleNumber(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int num : nums){
//             if(map.containsKey(num)){
//                 map.put(num, map.get(num) + 1);
//             } else {
//                 map.put(num, 1);
//             }
//         }

//         for(int key : map.keySet()){
//             if(map.get(key) == 1){
//                 return key;
//             }
//         }

//         return -1;
//     }
// }
// // class Solution {
//     public int singleNumber(int[] arr) {
//       int n = arr.length;
//       if(n==1) return arr[0];
//       int i=0;
//       Arrays.sort(arr);
//       for( i =1;i<n;i=i+2){
//         if(arr[i-1]==arr[i])
//          continue;
//         else if(arr[i-1]!=arr[i]) 
//         return arr[i-1];
//          else if(arr[n-1]!=arr[n-2])
//         return arr[n-1];
        
//       }  
//       return arr[i-1];      
//     }
// }
