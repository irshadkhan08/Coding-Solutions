//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class Gfg
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = 0;
            n = sc.nextInt();
            int arr[] =  new int[n];  //array of size n
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt(); //Input the array
             
            int sum = 0; 
            sum = sc.nextInt();
            
            Geeks obj = new Geeks();
            System.out.println(obj.sumExists(arr, n, sum));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Geeks
{
    public static int sumExists(int arr[], int n, int sum)
    {
        // add your code here
        
        int l = 0;
        int r = n-1;
        
        Arrays.sort(arr);
        if(r%2==0){
        while(l<r){
            if(arr[l]+arr[r]==sum){
                return 1;
            }
            else if(arr[l]+arr[r]<sum){
                l++;
            }
            else{
                r--;
            }
        }
        }
        else{
            while(l<r){
            if(arr[l]+arr[r]==sum){
                return 1;
            }
            else if(arr[l]+arr[r]<sum){
                l++;
            }
            else{
                r--;
            }
        }
        }
        return 0;
    }
}