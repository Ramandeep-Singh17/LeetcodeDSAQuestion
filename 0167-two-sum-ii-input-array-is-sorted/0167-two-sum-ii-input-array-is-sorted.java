class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] num = new int[2];
        int low=0;
        int high=numbers.length-1;
        while(low<=high){
            if(numbers[low]+numbers[high]==target){
                    num[0] = low+1;
                    num[1] = high+1;
                    return num;
            } 
            else if (numbers[low]+numbers[high]>target) high--;
            else{
                low++;
            }
        }
        return num;

    }
}