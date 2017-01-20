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

		int num = ana.nextInt();
		int x = ana.nextInt();
		int count = 0;

		StringBuilder out = new StringBuilder("");

		for(int i=1; i<=x; i++) {

			if(count == num-1) {
				out.append(i + "\n");
				count = 0;
				continue;
			}

			out.append(i + " ");
			count++;
		}

		String output = out.toString().trim();

		System.out.println(output);
	}
}