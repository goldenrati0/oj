import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

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
            ArrayList<Long> ids = new ArrayList<Long>();

            for(int tc=1; tc<=test; tc++) {

                ids.clear();

                long num = ana.nextLong();
                long temp = 0;

                for(long i=0; i<num; i++) {

                    temp = ana.nextLong();

                    if(ids.contains(temp)) {
                        ids.remove(temp);
                    } else {
                        ids.add(temp);
                    }
                }

                System.out.println("Case #" + tc +": " + ids.get(0));

            }
    	}
    }