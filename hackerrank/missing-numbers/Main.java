import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Created by tahmid on 3/5/17.
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
        int arrayA[] = new int[10000];
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = ana.nextInt();
            arrayA[num] += 1;
            listA.add(num);
        }

        int m = ana.nextInt();
        int arrayB[] = new int[10000];
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int num = ana.nextInt();
            arrayB[num] += 1;
            listB.add(num);
        }
        /* Input taking process completed*/

        ArrayList<Integer> lostNumbers = new ArrayList<>();

        for (Integer number:
             listB) {

            if(arrayA[number] != arrayB[number]) {
                if(!lostNumbers.contains(number))
                    lostNumbers.add(number);
            }
        }

        Collections.sort(lostNumbers);
        for (Integer num:
             lostNumbers) {
            System.out.print(num + " ");
        }
    }
}