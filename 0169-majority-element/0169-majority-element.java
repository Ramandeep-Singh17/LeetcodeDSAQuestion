class Solution {

    public int majorityElement(int[] arr) {
        int count =0;
        int n =arr.length;
            int el=0;
        for(int i =0;i<n;i++){
            if(count==0){
                count=1;
                el=arr[i];
            }
            else if(arr[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i =0;i<n;i++){
            if(arr[i]==el) 
            count1++;
        }
        if(count1>(n/2)){
            return el;
        }
        return -1;
    }
}