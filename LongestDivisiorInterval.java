import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());

            Set<Long> divisors = new HashSet<>();
            long limit = (long) Math.sqrt(n);
            for (long i = 1; i <= limit; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    divisors.add(n / i);
                }
            }

            List<Long> divisorList = new ArrayList<>(divisors);
            Collections.sort(divisorList);

            int count = 0;
            for (int i = 1; i < divisorList.size(); i++) {
                if (divisorList.get(i) - divisorList.get(i - 1) == 1) {
                    count++;
                }
            }

            out.println(count);
        }

        out.flush();
        out.close();
    }
}
