// RTE
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

    	while(true) {

    		String a = ana.nextLine();
    		String b = ana.nextLine();

    		int len = longestSubstr(a, b);
    		System.out.println(len);
    	}
    }

    public static int longestSubstr(String first, String second) {     
	    int maxLen = 0;
	    int fl = first.length();
	    int sl = second.length();
	    int[][] table = new int[fl+1][sl+1];
 
	    for (int i = 1; i <= fl; i++) {
	        for (int j = 1; j <= sl; j++) {
	            if (first.charAt(i-1) == second.charAt(j-1)) {
	                    table[i][j] = table[i - 1][j - 1] + 1;
	                if (table[i][j] > maxLen)
	                    maxLen = table[i][j];
	            }
	        }
	    }
	    return maxLen;
	}
}