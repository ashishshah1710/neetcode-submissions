class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length <= 1)
            return false;
        
        Set<Integer>duplicate=new HashSet<>();
        for(int i = 0;i<nums.length;i++)
        {
        if(!duplicate.add(nums[i]))
        {
            return true;
        }
        }

        return false;
    }
}