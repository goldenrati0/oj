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
        
        int[] numbers = new int[2001];
        
        FastReader ana = new FastReader();
        
        int total = ana.nextInt();
        
        for(int i=0; i<total; i++) {
            
            numbers[ana.nextInt()] += 1;
        }
        
        for(int i=0; i<numbers.length; i++) {
            
            if(numbers[i] != 0) {
                
                System.out.println(i + " aparece " + numbers[i] + " vez(es)");
            }
        }
    }
    
}
