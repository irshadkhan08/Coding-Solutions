//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
    {
        //add code here.
        
        boolean istrue = false;
        
        for(int i = 0; i<n; i++){
            int var = a[i];
            istrue = fun(var);
            if(istrue==false){
                return 0;
            }
        }
        return 1;
    }
    public static boolean fun(int N){
        int n = N;
        
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(rev==N){
            return true;
        }
        else{
            return false;
        }
    }
}