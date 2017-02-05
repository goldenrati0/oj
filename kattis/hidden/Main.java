import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
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
        
        String twoString = ana.nextLine();
        String[] ar = twoString.split(" ");
        
        String passwordString = ar[0];
        String messageString = ar[1];
        String outputString = "PASS";
        
        Stack<Character> passwordStack = new Stack<>();
        
        for(int i=passwordString.length()-1; i>=0; i--) {
            passwordStack.push(passwordString.charAt(i));
        }
        
        Stack<Character> checkerStack = new Stack<>();
        
        for(int i=0; i<messageString.length(); i++) {
            
            char temp = messageString.charAt(i);
            
            if(passwordStack.contains(temp) && passwordStack.peek() == temp) {
                checkerStack.push(passwordStack.pop());
            } else if(passwordStack.contains(temp) && passwordStack.peek() != temp) {
                outputString = "FAIL";
                break;
            }
        }
        
        if(passwordString.length() != checkerStack.size())
            outputString = "FAIL";
        
        System.out.println(outputString);
    }
}