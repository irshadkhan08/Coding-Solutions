//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int matrix[][], int n, int m, int k)
    {
	// Your code here

        int left = 0;
        // int right = c-1;
        int right = m-1;
        int top = 0;
        // int bottom = r-1;
        int bottom = n-1;
        int ans = -1;
        int index = 1;
        
        while(left<=right && top<=bottom){
   
           // 1 left to right
            for(int i = left; i<=right; i++){
               
                if(k==index){
                    ans = matrix[top][i];
                }
                 index++;
            }
            top++;
            
            //2 top to bottom
            for(int i = top; i<=bottom; i++){
                
                if(index==k){
                    ans = matrix[i][right];
                }
                index++;
            }
             right--;
             
            if(top<=bottom){
                
            for(int i = right; i>=left; --i){
               
                 if(index==k){
                     ans = matrix[bottom][i];
                 }
                 index++;
            }
            bottom--;
           }
            
            if(left<=right){
            for(int i = bottom; i>=top; --i){
              
                if(index==k){
                    ans = matrix[i][left];
                }
                index++;
            }
            left++;
            }
        }
        return ans;
    }
}