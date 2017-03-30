package birthday_cake_candles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/30/17.
 */
public class Solution {

    public static void main(String[] args) {

        FastReader ana = new FastReader();

        int n = ana.nextInt();
        int candles[] = new int[n];
        for (int i = 0; i < candles.length; i++) {
            candles[i] = ana.nextInt();
        }
        /* input completed*/

        Arrays.sort(candles);
        int maxHeight = candles[candles.length - 1];
        int counter = 0;
        for (int i = candles.length - 1; i >= 0; i--) {
            if(candles[i] != maxHeight)
                break;
            counter++;
        }
        System.out.println(counter);
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
