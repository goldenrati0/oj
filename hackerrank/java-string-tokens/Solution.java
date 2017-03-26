package java_string_tokens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/27/17.
 */
// ! , ? . _ ' @
public class Solution {

    public static void main(String[] args) {

        FastReader ana = new FastReader();
        String str = ana.nextLine();

        str = str.replaceAll("!", " ").replaceAll(",", " ").replaceAll("\\?", " ").replaceAll("\\.", " ").replaceAll("_", " ").replaceAll("'", " ").replaceAll("@", " ").replaceAll("\\s+", " ").trim();

        String[] strArray = str.split(" ");

        if (str.isEmpty())
            System.out.println(0);
        else {
            System.out.println(strArray.length);
            for (int i = 0; i < strArray.length; i++)
                System.out.println(strArray[i]);
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
