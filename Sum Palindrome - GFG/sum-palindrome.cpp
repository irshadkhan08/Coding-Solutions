//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
  long long reverse(long long  n){
        long long rev = 0;
        
        while(n!=0){
            rev =rev*10+n%10;
            n = n/10;
        }
        return rev;
    }
    long long isSumPalindrome(long long n){
        // code here
        if(n==reverse(n)){
            return n;
        }
        long long ans =n;
        long long i = 5;
        
        while(i!=0){
            ans = ans+reverse(ans);
            if(ans==reverse(ans)){
                return ans;
                break;
            }
            i--;
        }
        return -1;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long n;
        cin >> n;
        Solution ob;
        cout<<ob.isSumPalindrome(n)<<endl;
    }
    return 0;
}

// } Driver Code Ends