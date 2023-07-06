//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution
{
  public:
    string arrangeString(string str)
    {
        //code here.
        
            string st = "";
            int sum = 0;
            for(int i = 0; i<str.length(); i++){
                
        
                if(str[i]>='A' && str[i]<='Z'){
                    st = st+str[i];
                }
                else{
                   sum = sum+str[i]-48;
                }
            }
            
       sort(st.begin(),st.end());
       if(sum)
       return st+to_string(sum);
       else return st;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        Solution ob;
        cout <<ob.arrangeString(s) << endl;
    }
return 0;
}


// } Driver Code Ends