//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//This Problem has been asked in Amazon, Paytm, Amdocs
//So Don't Loose hope Keep Trying by 
//  Post on LinkedIn
/*
                #PlacementEdition
                
    Get Gifts on Maximum Reach Everyday
*/

class Solution {
  public:
    void printN(int n) {
    //   for(long long int i=1;i<=n;i++){
    //         cout<<i<<" ";
    //     }
    //     cout<<endl;
    
    
    //second solution without loop
    
    //using goto keyword and begin
    
    // int i = 0;
    // var:
    // i = i+1;
    // cout<<i<<" ";
    // if(i<n){
    //     goto var;
    // }
    // cout<<endl;
   
   
    int i = 0;
    label_name:
    i = i+1;
    cout<<i<<" ";
    if(i<n){
       goto label_name ;
    }
    cout<<endl;
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    scanf("%d ",&t);
    while(t--){
        
        int n;
        scanf("%d",&n);
        if(n>100000){
                cout<<"You are excedding limit";
                return 0;
        }
        Solution obj;
        
        obj.printN(n);
        
    }
}

// } Driver Code Ends