class Solution {
    public void sortColors(int[] arr) {
        
        
        //datch flag algorithms
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid<=high){
            if(arr[mid]==0){
                int temp =arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        
        
        
        
//         int zero = 0;
//         int one = 0;
//         int two = 0;
//         int n = arr.length;
//         for(int i = 0; i<n; i++){
//             if(arr[i]==0){
//                 zero++;
//             }
//             else if(arr[i]==1){
//                 one++;
//             }
//             else{
//                 two++;
//             }
//         }
        
//         for(int i = 0; i<zero; i++){
//             arr[i]=0;
//         }
//         for(int i = zero; i<zero+one; i++){
//             arr[i]=1;
//         }
//          for(int i = zero+one; i<n; i++){
//             arr[i]=2;
//         }
    }
}