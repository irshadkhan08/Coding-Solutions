class Solution {
    public int trap(int[] height) {
      
        int left = 0;
        int right = height.length-1;
        int leftMax = -1;
        int rightMax = -1;
        int ans = 0;
        
        while(left<=right){
        if(height[left]<=height[right]){
             if(leftMax<height[left])
             {
                 leftMax = height[left];
             }
            else{
                ans = ans+leftMax-height[left];
                left++;
            }
        }
        else{
            if(rightMax<height[right]){
                rightMax = height[right];
            }
            else{
                ans = ans+rightMax-height[right];
                right--;
            }
        }
        }
        return ans;
    }
}