import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

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

        for(int tc=1; tc<=test; tc++) {

            double r1 = ana.nextDouble();
            double r2 = ana.nextDouble();
            double r3 = ana.nextDouble();

            double exp1 = r1*r2*r3*(r1+r2+r3);

            double exp2 = 2*r2*r3 / ( (r1+r2)*(r1+r3) );
            double exp3 = 1 - exp2;
            double exp4 = Math.acos(exp3);
            double exp5 = Math.pow(r1,2);
            double exp6 = exp5*exp4;

            double exp7 = 2*r1*r3 / ( (r2+r1)*(r2+r3) );
            double exp8 = 1 - exp7;
            double exp9 = Math.acos(exp8);
            double exp10 = Math.pow(r2,2);
            double exp11 = exp9*exp10;

            double exp12 = 2*r1*r2 / ( (r3+r1)*(r3+r2) );
            double exp13 = 1 - exp12;
            double exp14 = Math.acos(exp13);
            double exp15 = Math.pow(r3,2);
            double exp16 = exp15*exp14;

            double exp17 = 0.5 * (exp6+exp11+exp16);
            double exp18 = Math.sqrt(exp1);

            double area = exp18 - exp17;

            System.out.printf("Case %d: %.10f%n", tc, area);
        }
    }
}