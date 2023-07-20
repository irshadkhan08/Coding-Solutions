class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = arr.length;
      
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
          
            }
        }
        
       int ans = 0;
        
        
        for(Map.Entry<Integer,Integer>res :map.entrySet()){
            if(res.getValue()==1){
                ans = res.getKey();
                break;
            }
        }
        return ans;
    }
}