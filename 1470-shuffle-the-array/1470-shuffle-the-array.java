class Solution {
    public int[] shuffle(int[] arr, int n) {
         int ans[] = new int[2*n];
         
        for(int i = 0; i<n;i++){
            ans[2*i] = arr[i];
            ans[2*i+1] = arr[n+i];
        }
        return ans;
    }
}