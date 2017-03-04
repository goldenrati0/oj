import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        ArrayList<Integer> cards = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cards.add(ana.nextInt());
        }

        int serejaScore = 0;
        int dimaScore = 0;
        boolean serejaTurn = true;

        while (!cards.isEmpty()) {

            if (serejaTurn) {

                int highValue = Math.max(cards.get(0), cards.get(cards.size() - 1));
                serejaScore += highValue;
                serejaTurn = false;
                if (highValue == cards.get(0))
                    cards.remove(0);
                else
                    cards.remove(cards.size() - 1);
            } else {

                int highValue = Math.max(cards.get(0), cards.get(cards.size() - 1));
                dimaScore += highValue;
                serejaTurn = true;
                if (highValue == cards.get(0))
                    cards.remove(0);
                else
                    cards.remove(cards.size() - 1);
            }
        }

        System.out.println(serejaScore + " " + dimaScore);
    }
}