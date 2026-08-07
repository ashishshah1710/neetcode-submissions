class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0 ;
        int right = numbers.length - 1;
        int sum = numbers[left] + numbers[right];
        while( left < right){
             if(sum == target){
                return new int[]{left+1,right+1};
             }
             else if(sum < target){
                left++;
             }
             else{
                right--;
             }
             sum = numbers[left] + numbers[right];
        }
        return new int[0];
    }
}
