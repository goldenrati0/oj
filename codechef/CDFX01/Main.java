import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
 
public class Main {
 
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        float nextFloat()
        {
            return Float.parseFloat(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static void main(String[] args) {
        
 
        FastReader ana = new FastReader();
 
        int test = ana.nextInt();
 
        for(int tc=0; tc<test; tc++) {
 
            String a = ana.next();
            a = a.toLowerCase();
            String b = ana.next();
            b = b.toLowerCase();
 
            String[] s = {a, b};
 
            Arrays.sort(s);
 
            if(a.equals(b)) {
                System.out.println("equal");
            } else {
 
                if(a.equals(s[0]))
                    System.out.println("first");
                else
                    System.out.println("second");
            }
        }
    }
}