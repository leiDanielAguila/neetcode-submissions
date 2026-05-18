class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int x=0; x<nums.length; x++) {
            int curr = nums[x];

            for (int y = x+1; y<nums.length; y++) {
                if(curr == nums[y]) {
                    return true;                    
                }
            }
        }

        return false;
    }
}