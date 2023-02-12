//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
         for(i = 0 ; i<arr.length; i++){

           System.out.print(arr[i]+" ");
       }
       
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int a[], int n)
  {
      //code here
      for(int i =1; i<n; i++){
          int temp = a[i];
          int j = i-1;
          for(; j>=0; j--){
              if(temp<a[j]){
                  a[j+1] = a[j];
              }else{
                  break;
              }
          }
          a[j+1] = temp;
      }
  }
}