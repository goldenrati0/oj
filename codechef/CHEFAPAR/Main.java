import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/5/17.
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
            int numberOfZeros = 0;
            int numberOfOnes = 0;
            boolean firstZero = false;

            for (int i = 0; i < n; i++) {
                int num = ana.nextInt();

                if (num == 0)
                    firstZero = true;

                if (firstZero) {
                    if (num == 0)
                        numberOfZeros += 1;
                    else if (num == 1)
                        numberOfOnes += 1;
                }
            }

            int totalCost = (numberOfZeros * 1100) + (numberOfOnes * 100);
            System.out.println(totalCost);
        }
    }
}