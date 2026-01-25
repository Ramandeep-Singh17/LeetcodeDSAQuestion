class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
               ArrayList<Integer> ans = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (arr1[i] == arr2[j]) {
                       
                        ans.add(arr1[i]);
                        arr2[j]='a';
                        break;
                }
            }
        }

//ye yaad rakhna ki seedha ARR likhne se wo Array return nhi hota 
//  yaad rakhna loop laga ke usko ek dusre Array me dale and uske i ko get kare 
// phir usko return kare.
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }
}