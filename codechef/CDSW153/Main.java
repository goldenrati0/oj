import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
/**
 *
 * @author tahmid
 */
public class Main {
 
    static class FastReader {
 
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
 
        int[] allPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
 
        FastReader ana = new FastReader();
 
        int test = ana.nextInt();
 
        for (int tc = 0; tc < test; tc++) {
 
            int n = ana.nextInt();
            long l = ana.nextInt();
            long r = ana.nextInt();
 
            long count = 0;
            ArrayList<Integer> primes = new ArrayList<>();
 
            for (int i = 0; i < allPrimes.length; i++) {
 
                if (allPrimes[i] <= n) {
                    count += (Math.floor(r / allPrimes[i]) - Math.ceil((l-1) / allPrimes[i]));
                    primes.add(allPrimes[i]);
                } else {
                    break;
                }
            }
 
//            System.out.println(count);
            long[] primesArray = new long[primes.size()];
 
            for (int i = 0; i < primesArray.length; i++) {
                primesArray[i] = primes.get(i);
            }
 
//            for (long v : primesArray) {
//                System.out.print("v:" + v + " ");
//            }
//            System.out.println();
            for (int i = 0; i < primesArray.length - 1; i++) {
 
                for (int j = i + 1; j < primesArray.length; j++) {
                    int m = allPrimes[i] * allPrimes[j];
 
                    if (m <= r) {
//                        System.out.print("m:" + m + " ");
                        count -= (Math.floor(r / m) - Math.ceil((l-1) / m));
                    }
 
                }
 
            }
 
//
//            count = lcm(primesArray, count, r, l);
            System.out.println(count);
        }
    }
}