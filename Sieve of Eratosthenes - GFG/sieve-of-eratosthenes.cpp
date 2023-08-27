//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++
class Solution
{
public:
    vector<int> sieveOfEratosthenes(int N)
    {
        // Write Your Code here
        vector<int> ans;
        for(int i=2;i<=N;i++){
            if(isPrime(i)){
                ans.push_back(i);
            }
        }
        return ans;
    }

    bool isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
            
        }
        return true;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin>>N;
        Solution ob;
        vector<int> primes  = ob.sieveOfEratosthenes(N);
        for(auto prime : primes) {
            cout<< prime <<" ";
        }
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends