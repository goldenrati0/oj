package mini_max_sum;

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

        long numbers[] = {ana.nextLong(), ana.nextLong(), ana.nextLong(), ana.nextLong(), ana.nextLong()};
        Arrays.sort(numbers);

        System.out.println((numbers[0] + numbers[1] + numbers[2] + numbers[3]) + " " + (numbers[1] + numbers[2] + numbers[3] + numbers[4]));
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
