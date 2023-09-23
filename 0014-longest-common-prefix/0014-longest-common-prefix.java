class Solution {
    public String longestCommonPrefix(String[] arr) {
           int n = arr.length;
           Arrays.sort(arr);
        char a[] = arr[0].toCharArray();
        char b[] = arr[n-1].toCharArray();
        
        String ans = "";
        int i = 0;
        int j = 0;
        boolean istrue = false;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                istrue = true;
                ans = ans+a[i];
                  i++;
                  j++;
            }
            else{
                break;
            }
        }
        if(istrue){
            return ans;
        }
        else{
            return "";
        }
        
        
    }
}