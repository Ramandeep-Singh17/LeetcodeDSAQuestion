// class Solution {
//     public int[] intersect(int[] arr1, int[] arr2) {
//                ArrayList<Integer> ans = new ArrayList<>();

//         int n = arr1.length;
//         int m = arr2.length;

//         for (int i = 0; i < n; i++) {

//             for (int j = 0; j < m; j++) {

//                 if (arr1[i] == arr2[j]) {
                       
//                         ans.add(arr1[i]);
//                         arr2[j]=Integer.MIN_VALUE;
//                         break;
//                 }
//             }
//         }

// //upper dhyan se dekho wha array return karna hai hm arraylist return nhi kar sakte 
// //similarly agar arraylist hota tab array return nhi , so is case me hm fixed  array 
// // size bana rhe hai and use return karenge
//         int[] result = new int[ans.size()];
//         for (int k = 0; k < ans.size(); k++) {
//             result[k] = ans.get(k);
//         }

//         return result;
//     }
// }
class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    ans.add(arr1[i]);
                   
                    break;
                }
            }
        }
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        return result;
    }
}