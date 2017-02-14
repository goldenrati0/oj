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

    	for(int tc=0; tc<test; tc++) {

    		String str = ana.nextLine();
    		char[] strChar = str.toCharArray();

    		StringBuilder out = new StringBuilder("");

    		for(int i=(strChar.length-1)/2; i>=0; i--) {
    			out.append(strChar[i]);
    		}

    		for(int i=strChar.length-1; i>(strChar.length-1)/2; i--) {
    			out.append(strChar[i]);
    		}

    		System.out.println(out.toString());
    	}
    }
}