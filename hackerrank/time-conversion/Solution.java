package time_conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/30/17.
 */
public class Solution {

    public static void main(String[] args) {

        FastReader ana = new FastReader();

        String time = ana.nextLine();
        String hms[] = time.split(":");
        char format = time.charAt(time.length() - 2);

        if (format == 'A' && !hms[0].equals("12")) {
            System.out.println(time.substring(0, time.length() - 2));
        } else if (format == 'A' && hms[0].equals("12")) {
            System.out.println("00" + ":" + hms[1] + ":" + hms[2].substring(0, hms[2].length()-2));
        } else if (format == 'P' && !hms[0].equals("12")) {
            int hour = Integer.parseInt(hms[0]);
            System.out.println((hour + 12) + ":" + hms[1] + ":" + hms[2].substring(0, hms[2].length()-2));
        } else if (format == 'P' && hms[0].equals("12")) {
            int hour = Integer.parseInt(hms[0]);
            System.out.println((hour + 0) + ":" + hms[1] + ":" + hms[2].substring(0, hms[2].length()-2));
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
