 
public class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
 
        while (t-- > 0) {
            int n = ob.nextInt();
            int[] ary = new int[n];
            for (int i = 0; i < n; i++) {
                ary[i] = ob.nextInt();
            }
 
            int max = 0;
 
          
               
          for (int i = 0; i < n; i++) {
    if(ary[i]==1)
    ary[i]++;
}
          for (int i = 1; i < n; i++) {
    if(ary[i]%ary[i-1]==0)
    ary[i]++;
}
 
           
            for (int num : ary) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
 
 
    }
}
