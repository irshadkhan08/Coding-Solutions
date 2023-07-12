class Solution {
    public int maxArea(int[] height) {
        
        int dis = 0;
        int MaxArea = Integer.MIN_VALUE;
        int area = 0;
        int start = 0;
        int end = height.length-1;
        
        while(start<=end){
                if(height[start]<=height[end]){
                    int h = height[start];
                     dis = end-start;
                    start++;
                    area = h*dis;
                    if(MaxArea<area){
                        MaxArea = area;
                      }     
                  }
            else{
                int h = height[end];
                dis = end-start;
                end--;
                area = h*dis;
                if(MaxArea<area){
                    MaxArea = area;
                }
            }
            
        }
        return MaxArea;
    }
}