// class Solution {
//     public boolean isTrionic(int[] arr) {
//         int n = arr.length;
//         int idx1=-1;
//         int idx2=-1;
//         for(int i =0;i<n-1;i++){
//          if (arr[i] == arr[i + 1]) return false; 
//             if(arr[i]>arr[i+1]){  
//                 idx1=i;
//                  break;
//             }
//         }
//        if (idx1 <= 0) return false;
//         for (int i =idx1+1;i<n-1;i++){
//           if (arr[i] == arr[i + 1]) return false; 
//             if(arr[i]<arr[i+1]){
//                 idx2=i;
//                 break;
//             }
//         }
//         if (idx2 >= n - 1) return false;
//         for(int i=idx2+1;i<n-1;i++){
//              if(arr[i]>arr[i+1])
//                return false;
                
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isTrionic(int[] arr) {
        int n = arr.length;
        int idx1 = -1;
        int idx2 = -1;

        // first break: inc -> dec
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) return false;
            if (arr[i] > arr[i + 1]) {
                idx1 = i;
                break;
            }
        }
        if (idx1 <= 0) return false;

        // second break: dec -> inc
        for (int i = idx1 + 1; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) return false;
            if (arr[i] < arr[i + 1]) {
                idx2 = i;
                break;
            }
        }
        if (idx2 <= idx1 || idx2 >= n - 1) return false;

        // last part: strictly increasing
        for (int i = idx2 + 1; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) return false;
        }

        return true;
    }
}
