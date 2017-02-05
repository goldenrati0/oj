import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        
        boolean[] allPrimes = new boolean[5000001];
        Arrays.fill(allPrimes, true);
        allPrimes[0] = allPrimes[1] = false;
        
        for(int i=2; i*i<allPrimes.length; i++) {
            
            if(allPrimes[i]) {
                
                for(int j=i*2; j<allPrimes.length; j+=i) {
                    allPrimes[j] = false;
                }
            }
        }
        
        FastReader ana = new FastReader();
        
        int test = ana.nextInt();
        
        for(int tc=0; tc<test; tc++) {
            
            int m = ana.nextInt();
            int n = ana.nextInt();
            long sum = 0;
            
            for(int i=m; i<=n; i++) {
                
                if(allPrimes[i]) {
                    sum += i;
                }
            }
            
            System.out.println(sum);
        }
    }
}