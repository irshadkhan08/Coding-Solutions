//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        
        // first method
    //   String n = String.valueOf(num);//"1004"
    //   n = n.replaceAll("0","5");//"1554"
    //   return Integer.parseInt(n);//1554
    
    //second method
    
    int rev = 0;
    int d = 0;
    
    while(0<num){
        d = num%10;
        
        if(d==0){
            d = 5;
        }
        rev = rev*10+d;
        num = num/10;
    }
    
    int ans = 0;
    int rem = 0;
    
    while(0<rev){
        rem = rev%10;
        
        ans = ans*10+rem;
        rev = rev/10;
    }
    return ans;
    }
}