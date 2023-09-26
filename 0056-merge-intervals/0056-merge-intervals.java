class Solution {
    public int[][] merge(int[][] Intervals) {
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>list = new ArrayList<>();
        
        for(int interval[] : Intervals){
            
            if(list.size()==0){
               list.add(interval);
            }
            else{
                int pre[] = list.get(list.size()-1);
                  // int pre[] = list.get(list.size()-1);
                if(interval[0]<=pre[1]){
                    pre[1] = Math.max(interval[1],pre[1]);
                }
                else{
                    list.add(interval);
                }
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}