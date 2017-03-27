package java_bigdecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/27/17.
 */
public class Solution {

    public static void main(String[] args) {

        FastReader ana = new FastReader();

        int n = ana.nextInt();
        String strs[] = new String[n];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = ana.nextLine();
        }
        /* Input processing completed*/

        // Sorting using custom Comparator
        Arrays.sort(strs, 0, n, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {

                BigDecimal a = new BigDecimal(s);
                BigDecimal b = new BigDecimal(t1);

                return b.compareTo(a);
            }
        });

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
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
