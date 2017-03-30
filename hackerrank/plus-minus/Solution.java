package plus_minus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/30/17.
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

        int n = ana.nextInt();
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for(int i=0; i<n; i++) {
            int temp = ana.nextInt();

            if(temp > 0)
                positive++;
            else if(temp < 0)
                negative++;
            else if(temp == 0)
                zero++;
        }
        /* input completed*/

        System.out.printf("%.6f\n", (positive/n));
        System.out.printf("%.6f\n", (negative/n));
        System.out.printf("%.6f\n", (zero/n));
    }
}
