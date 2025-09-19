import java.util.*;
import java.io.*;

public class Main {
    public static void main(String ar[]) {
        int t;

        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();

        while (t-- > 0) {
            int n, k;
            n = ob.nextInt();
            k = ob.nextInt();
            String s=ob.next();
          
            

            if (s.length() == 1) {
                System.out.println("YES");
                continue; 
            }

            
            HashMap<Character, Integer> hm = new HashMap<>();
            for (char ch : s.toCharArray()) {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }

int oddCount = 0;
for (int val : hm.values()) {
    if (val % 2 != 0) oddCount++;
}


            
          if (oddCount-k<=1) {
    System.out.println("YES");
} else {
    System.out.println("NO");
}
        }
    }
}
