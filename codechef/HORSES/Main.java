import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 4/1/17.
 */
public class Main {

    public static void main(String[] args) {

        FastReader ana = new FastReader();
        int test = ana.nextInt();

        for (int tc = 0; tc < test; tc++) {

            int n = ana.nextInt();
            int horses[] = new int[n];
            for (int i = 0; i < n; i++) {
                horses[i] = ana.nextInt();
            }
            /* input complete*/

            Arrays.sort(horses);
            int minDifference = Integer.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                int temp = horses[i + 1] - horses[i];
                if (temp < minDifference)
                    minDifference = temp;
            }

            System.out.println(minDifference);
        }
    }

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
}
