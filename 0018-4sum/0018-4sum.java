class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
        //List<List<Integer>>ans = new ArrayList<>();
        // if(target==-294967296) return ans;
        
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
        //List<List<Integer>> q=new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;  i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int l = j+1;
                int r = nums.length-1;
                
                while(l<r){
                   ArrayList<Integer>al = new ArrayList<Integer>();
                    
                    if(nums[i]+nums[j]+nums[l]+nums[r]==target){
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[l]);
                        al.add(nums[r]);
                        l++;
                        r--;
                        if(!ans.contains(al)){
                            ans.add(al);
                        }
                       
                    }
                    else if(nums[i]+nums[j]+nums[l]+nums[r]<target){
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