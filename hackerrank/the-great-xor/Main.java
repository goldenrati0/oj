import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

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
    	
    	StringBuilder word = null;
    	long count = 0;

    	for (int tc=0; tc<test; tc++) {
    		
    		long x = ana.nextLong();
    		count = 0;
    	
	    	word = new StringBuilder(Long.toString(x, 2));
	    	word = word.reverse();

	    	int index = word.indexOf("0");
	    	count += Math.pow(2, index);

			while(index >= 0) {
			   index = word.indexOf("0", index+1);
			   count += Math.pow(2, index);
			}

			System.out.println(count);
    	}
    }
}