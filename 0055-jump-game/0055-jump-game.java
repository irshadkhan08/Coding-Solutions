class Solution {
    public boolean canJump(int[] nums) {
        
        int jump = 0;
        int pos = 0;
        int d = 0;
        
        int i = 0;
        
        while(i<nums.length-1){
            d = Math.max(d,nums[i]+i);
            
            if(pos==i){
             pos = d;
                jump++;
            }
            i++;
        }
        
        if(pos<nums.length-1){
            return false;
        }
        return true;
        
    }
}