import java.util.*;

public class Main {
    public static void main(String[] args) {
       int t;
      Scanner ob = new Scanner(System.in);
       t = ob.nextInt();
     while (t-- > 0) {
         int n, q;
       n = ob.nextInt();
      q = ob.nextInt();
       int[] arry = new int[n];
      int oldSum = 0;
     for (int i = 0; i < n; i++) {
          arry[i] = ob.nextInt();
          oldSum += arry[i];
         }

      int[] pre = new int[n];
      pre[0] = arry[0];
     for (int i = 1; i < n; i++) {
         pre[i] = pre[i - 1] + arry[i];
            }

      while (q-- > 0) {
           int l, r, k;
          l = ob.nextInt() - 1; 
         r = ob.nextInt() - 1; 
         k = ob.nextInt();

                
          int sum = pre[r] - (l > 0 ? pre[l - 1] : 0);
            int newSum = (r - l + 1) * k;

           int totalSum = oldSum - sum - newSum;

            if (totalSum % 2 != 0) {
            System.out.println("YES");
           } else {
              System.out.println("NO");
          }
      }
      }
}
}
