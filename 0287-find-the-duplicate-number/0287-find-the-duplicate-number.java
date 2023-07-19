class Solution {
    public int findDuplicate(int[] nums) {
        int r = 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i]!=nums[i+1]){
                continue;
            }
           else{
               r = nums[i];
}
        }
        
        return r;
    }
}