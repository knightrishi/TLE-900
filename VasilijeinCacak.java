import java.util.*;
import java.io.*;

public class Main {
    public static void main(String ar[]) {
        int t;

        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();

        while (t-- > 0) {
            long n, k,x;
            n = ob.nextLong();//1-n range
            k = ob.nextLong();//no of elements ya kitna chun  askte hai
            x = ob.nextLong();//sum 
          long minSum=0, maxSum=0;
          long count=0;
          
            
           minSum = k*(k+1)/2;//smallest sum in ram=nge n by selecting K distinct element

       maxSum=(k*n)-(k*(k-1))/2;//max sum in range n by selecting K distinct element
       
       if(x>=minSum && x<=maxSum)
       System.out.println("YES");
       
          else
            System.out.println("NO");
           
        
        }
    }
}
