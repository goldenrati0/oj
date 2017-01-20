import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
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

    static class comp implements Comparator<StringBuilder> {
	  public int compare(StringBuilder o1, StringBuilder o2) {
	    return Integer.compare(o1.length(), o2.length());
	  }
	}

    public static void main(String[] args) {
    	
    	FastReader ana = new FastReader();

    	while(true) {

    		int num = ana.nextInt();

    		if(num == 0)
    			break;

    		StringBuilder[] strs = new StringBuilder[num];
    		for (int i=0; i<strs.length; i++) {
    			strs[i] = new StringBuilder(ana.nextLine());
    		}
    		Arrays.sort(strs, new comp());

    		/*for (int i=0; i<strs.length; i++) {
    			System.out.println(strs[i]);
    		}*/

    		ArrayList<Integer> count = new ArrayList<Integer>();

    		for(int i=strs.length-1; i>=0; i--) {

    			int c = 0;

    			for(int j=0; j<i; j++) {

    				String temp = strs[i].toString();
    				temp = temp.replaceAll(strs[j].toString(), "");

    				if(temp.length() < strs[i].length()) {
    					c++;
    				}
    			}

    			count.add(c);
    		}

    		Object[] x = count.toArray();
    		Arrays.sort(x);
    		System.out.println(x[x.length-1]);
    	}
    }
}

/*
- http://stackoverflow.com/questions/2560262/generate-all-unique-substrings-for-given-string
- http://allisons.org/ll/AlgDS/Tree/Suffix/
*/