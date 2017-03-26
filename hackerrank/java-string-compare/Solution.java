package java_string_compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/27/17.
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
        String str = ana.nextLine();
        int stringLength = str.length();
        int k = ana.nextInt();

        List<String> allPossibleSubstring = new ArrayList<>();

        for(int i=0; i<=stringLength-k; i++) {
            allPossibleSubstring.add(str.substring(i, i+k));
        }
        Collections.sort(allPossibleSubstring);

        System.out.println(allPossibleSubstring.get(0) + "\n" + allPossibleSubstring.get(allPossibleSubstring.size()-1));
    }
}
