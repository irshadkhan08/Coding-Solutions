//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

// User function Template for C++
class Solution {
  public:
    long long int squaresDiff(int N){
        // code here
        long long int n,sq,sum,sum_sq,z;
        n=N;
        
        sq = (n*(n+1)*(2*n+1))/6;
        
        sum = n*(n+1)/2;
        
        sum_sq = sum*sum;
        
        z = abs(sq-sum_sq);
        return z;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.squaresDiff(N) << endl;
    }
    return 0;
}

// } Driver Code Ends