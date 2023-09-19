class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        
        int left = -1;
        int right = -1;
        
        int l = 0;
        int r = nums.length-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            
            if(nums[mid]==target){
                 left = mid;
                 r = mid-1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        
        l = 0;
        r = nums.length-1;
         while(l<=r){
            int mid = (l+r)/2;
            
            if(nums[mid]==target){
                 right = mid;
                 l = mid+1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        
        ans[0] = left;
        ans[1] = right;
        
        return ans;
    }
}