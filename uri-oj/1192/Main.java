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
//        ana.nextLine();
        
        for(int tc=0; tc<test; tc++) {
            
            String x = ana.nextLine();
            
            if(x.charAt(0) == x.charAt(2)) {
                
                System.out.println( Integer.parseInt( String.valueOf( x.charAt(0) ) ) * Integer.parseInt( String.valueOf( x.charAt(2) ) ) );
                continue;
            }
            
            if( x.charAt(1) >= 'A' && x.charAt(1) <= 'Z' ) {
                
                int last = Integer.parseInt(String.valueOf(x.charAt(2)));
                int first = Integer.parseInt(String.valueOf(x.charAt(0)));
                
                System.out.println(last - first);
            } else if( x.charAt(1) >= 'a' && x.charAt(1) <= 'z' ) {
                
                int last = Integer.parseInt(String.valueOf(x.charAt(2)));
                int first = Integer.parseInt(String.valueOf(x.charAt(0)));
                
                System.out.println(last + first);
            }
        }
    }
}
