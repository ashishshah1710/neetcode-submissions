class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[n * 2];
        
        // Copy nums into the first half of result
        System.arraycopy(nums, 0, result, 0, n);
        // Copy nums into the second half of result
        System.arraycopy(nums, 0, result, n, n);
        
        return result;
    }
}
