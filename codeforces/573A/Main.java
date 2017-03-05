import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/4/17.
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

        int n = ana.nextInt();
        int bids[] = new int[n];

        for (int i = 0; i < n; i++) {

            int value = ana.nextInt();

            while (value % 2 == 0)
                value /= 2;
            while (value % 3 == 0)
                value /= 3;

            bids[i] = value;
        }

        for(int i=0; i<bids.length-1; i++) {
            if(bids[i] != bids[i+1]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}