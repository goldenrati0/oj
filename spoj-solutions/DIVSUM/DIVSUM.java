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
            
            int num = ana.nextInt();
            
            if(num == 1) {
                System.out.println("0");
                continue;
            }
            
            long sum = 1;
            
            for(int i=2; i<=Math.sqrt(num); i++) {
                
                if(num%i == 0) {
                    
                    sum += i;
                    
                    int res = num/i;
                    
                    if(res != i)
                        sum += res;
                }
            }
            System.out.println(sum);
        }
    }
}
