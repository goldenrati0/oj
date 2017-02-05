import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author tahmid
 */
public class Main {

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        int testcase = ana.nextInt();

        for (int tc = 0; tc < testcase; tc++) {

            String a = ana.next();
            String b = ana.next();
            String substring = "";

            if (a.length() > b.length()) {

                substring = a.substring(a.length() - b.length(), a.length());

                if (substring.equals(b)) {
                    System.out.println("encaixa");
                } else {
                    System.out.println("nao encaixa");
                }
            } else {

                substring = b.substring(0, a.length());

                if (substring.equals(b)) {
                    System.out.println("encaixa");
                } else {
                    System.out.println("nao encaixa");
                }
            }
        }
    }
}
