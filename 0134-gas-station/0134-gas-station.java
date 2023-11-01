class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int deficit = 0;
        int bal = 0;
        int start = 0;

        for(int i = 0; i<cost.length; i++){
            bal = bal+gas[i]-cost[i];
            if(bal<0){
                deficit = deficit+bal;
                start = i+1;
                bal = 0;
            }
        }

        if(deficit+bal>=0){
            return start;
        }
        return -1;

    }
}