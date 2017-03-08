import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/9/17.
 */
public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader ana = new FastReader();
        int test = ana.nextInt();
        for (int tc = 0; tc < test; tc++) {

            int n = ana.nextInt();
            int k = ana.nextInt();

            int t[] = new int[n];
            int d[] = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = ana.nextInt();
                d[i] = ana.nextInt();
            }
            /*Input taking process completed*/

            int totalCost = 0;

            if (k == 0) {

                for (int i = 0; i < n; i++) {
                    totalCost += t[i] * d[i];
                }
                System.out.println(totalCost);
            } else {

                for (int i = 0; i < n; i++) {

                    if (k > 0) {
                        k -= t[i];
                        if (k < 0) {
                            totalCost += Math.abs(k) * d[i];
                        }
                    } else {
                        totalCost += t[i] * d[i];
                    }
                }
                System.out.println(totalCost);
            }
        }
    }
}