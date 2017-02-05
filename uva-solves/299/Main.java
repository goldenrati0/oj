import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        
        FastReader ana = new FastReader();
        
        int test = ana.nextInt();
        
        for(int tc=0; tc<test; tc++) {
            
            int lengthOfTrain = ana.nextInt();
            int[] numbers = new int[lengthOfTrain];
            
            for(int i=0; i<numbers.length; i++) {
                numbers[i] = ana.nextInt();
            }
            
            int totalSwaps = 0;
            
            for(int i=0; i<numbers.length; i++) {
                for(int j=0; j<numbers.length-1; j++) {
                    
                    if(numbers[j] > numbers[j+1]) {
                        
                        int temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;
                        totalSwaps++;
                    }
                }
            }
            System.out.println("Optimal train swapping takes " + totalSwaps + " swaps.");
        }
    }
}