import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/4/17.
 */
public class Solution {

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

            int m = ana.nextInt();
            int n = ana.nextInt();
            int ns[] = new int[n];
            for (int i = 0; i < ns.length; i++) {
                ns[i] = ana.nextInt();
            }
            /* Input taking process completed*/

            for(int i=0; i<ns.length; i++) {
                for(int j=i+1; j<ns.length; j++) {
                    int total = ns[i] + ns[j];

                    if(total == m) {
                        System.out.println((i+1) + " " + (j+1));
                        break;
                    }
                }
            }
        }
    }
}