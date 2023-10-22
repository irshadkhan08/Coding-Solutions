//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		int arr[] = new int[s.size()];
		int n = s.size();
		
		int k = 0;
	    while(!s.isEmpty()){
	        arr[k++] = s.pop();
	    }
	    
		for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
		
		k = 0;
		int arr1[] = new int[arr.length];
		for(int i = 0; i<arr.length; i++){
		  arr1[k++] = arr[i];
		}
		
		Stack<Integer>ans = new Stack<>();
		
		for(int i = 0; i<arr1.length; i++){
		    ans.push(arr1[i]);
		}
	  
	  return ans;
	}
}