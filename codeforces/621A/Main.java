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
        
        int n = ana.nextInt();
        
        long sum = 0;
        int lowestValue = Integer.MAX_VALUE;
        int temp = 0;
        
        for(int i=0; i<n; i++) {
            
            temp = ana.nextInt();
            sum += temp;
            
            if(temp%2 != 0)
                lowestValue = Math.min(lowestValue, temp);
        }
        
        if(sum%2 != 0) {
            sum -= lowestValue;
        }
        
        System.out.println(sum);
    }
}