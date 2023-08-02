//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading testcases count
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)       {
            
            String st[] = read.readLine().trim().split(" ");
            
            //reading size of array 
            int N =Integer.parseInt(st[0]);
            
            //creating a new array of size n
            int A[] = new int[N];
            st = read.readLine().trim().split(" ");
            
            //adding elements to the array
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(st[i]);
                
            //calling the method binSort() of
            //class BinarySort()
            new Solution().binSort(A, N);
            
            //printing the elements of array
            for(Integer x: A)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}



// } Driver Code Ends




//User function Template for Java

class Solution
{
    //Function to sort the binary array.
    static void binSort(int arr[], int n)
    {
        // add your code here
        
        
        /**************
        * No need to print the array
        * ************/
        Arrays.sort(arr);
        int count = 0;
       for(int i = 0; i<n; i++){
         if(arr[i]==0){
             count++;
         }
       }
       for(int i = 0; i<count; i++){
           arr[i] = 0;
       }
       for(int i = count; i<n; i++){
           arr[i] = 1;
       }
    }
}

