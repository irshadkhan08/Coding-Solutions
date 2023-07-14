class Solution {
    public int[][] transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
      
        // int res[][] = new int[col][row];
        // for(int i = 0; i<col; i++){
        //     for(int j = 0; j<row; j++){
        //        res[i][j] = arr[j][i];
        //     }
        // }
        // return res;
        
        
        int res[][] = new int[arr[0].length][arr.length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                res[j][i] = arr[i][j];
            }
        }
        return res;
    }
}