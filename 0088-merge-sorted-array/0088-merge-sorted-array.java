class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
       int res[] = new int[n+m];
       int i = 0;
       int j = 0;
       int id=0;
       while(i<n && j<m){
          if(arr1[i]<arr2[j]){
            res[id]=arr1[i];
            id++;
            i++;
          }
          else{
             res[id]=arr2[j];
            id++;
            j++;
          }
       }
       while(j<m){
        res[id]= arr2[j];
        id++;
        j++;
       }
        while(i<n){
        res[id]= arr1[i];
        id++;
        i++;
       }
    //return res;
    // ye nhi kar sakte hai because void function
    // so hme isko arr1 me hi copy kar denge usse ye hoga ki arr1 change ho jayega and java pass by  refrence se  wo orginal me bhi dikh jayga error nhi aayega
    // leetcode ne hi bola hai final answer arr1 me return karne k+ko
    for(int k = 0; k < n + m; k++) {
    arr1[k] = res[k];
    }
    }
}