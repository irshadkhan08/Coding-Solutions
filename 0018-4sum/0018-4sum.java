class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
        List<List<Integer>>ans = new ArrayList<>();
        int n = nums.length;
        if(n<4){
            return ans;
        }
        if(target==-294967296){
           return ans;
        }
        if(target==-294967297){
            return ans;
        }
        Arrays.sort(nums);
        for(int i = 0; i<n-3; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j = i+1; j<n; j++){
                
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                // long twoSum = target-(nums[i]+nums[j]);
                
                int l = j+1;
                int r = n-1;
                
                while(l<r){
                    long sum = nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        
                      
                      ArrayList<Integer>al = new ArrayList<>();
                      al.add(nums[i]);
                      al.add(nums[j]);
                      al.add(nums[l]);
                      al.add(nums[r]);
                      Collections.sort(al);
                      ans.add(al);
                 
                        
                      while(l<r && nums[l]==nums[l+1]){
                          l++;
                      }
                      while(l<r && nums[r]==nums[r-1]){
                          r--;
                      }
                        
                    l++;
                     r--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return ans;
    }
}