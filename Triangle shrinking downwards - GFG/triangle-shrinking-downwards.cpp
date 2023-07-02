//{ Driver Code Starts
#include <bits/stdc++.h>
#include<string>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    string triDownwards(string S) {
        // code here
        string ans = "";
        
        for(int i = 0; i<S.size(); i++){
            // for(int j = 0; j<i; j++){
            //     ans = ans+".";
            // }
            // for(int k = i; k<S.size(); k++){
            //     ans = ans+S[k];
            // }
            
            for(int j = 0; j<S.size(); j++){
                if(i>j){
                    ans = ans+".";
                }
                else{
                    ans = ans+S[j];
                }
            }
        }
        return ans;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        
        cin >> S;

        Solution ob;
        string ans=ob.triDownwards(S);
        
        for(int i=0 ; i<ans.length() ; i++)
        {
            cout<<ans[i];
            if((i+1)%S.length()==0)
                cout<<endl;
        }
        
    }
    return 0;
}
// } Driver Code Ends