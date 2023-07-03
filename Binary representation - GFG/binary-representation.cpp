//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{
public:
    string getBinaryRep(int N)
    {
        // Write Your Code here
        
        int digit = 0;
        string ans= "000000000000000000000000000000";
        int l = 29;
        while(N!=0)
        {
            if(N%2==0){
                ans[l] = '0';
                l--;
            }
            else{
                ans[l] = '1';
                l--;
            }
            N = N/2;
        }
        return ans;
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
        cin >> N;
       
        Solution ob;
        string ans = ob.getBinaryRep(N);
        cout << ans << endl;
    }
    return 0;
}
// } Driver Code Ends