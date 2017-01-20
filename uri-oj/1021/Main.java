import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

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
        StringBuilder out = new StringBuilder("");

        int[] notes = new int[101];
        int[] coins = new int[51];

        String money = ana.nextLine();
        String[] nc = money.split(Pattern.quote("."));
        // System.out.println(nc.length);

        int n = Integer.parseInt(nc[0]);
        int c = Integer.parseInt(nc[1]);
        // System.out.println(576/100);

        if(n>=100) {
            notes[100] = n/100;
            n = n - notes[100]*100;
        }
        if(n>=50) {
            notes[50] = n/50;
            n = n - notes[50]*50;
        }
        if(n>=20) {
            notes[20] = n/20;
            n = n - notes[20]*20;
        }
        if(n>=10) {
            notes[10] = n/10;
            n = n - notes[10]*10;
        }
        if(n>=5) {
            notes[5] = n/5;
            n = n - notes[5]*5;
        }
        if(n>=2) {
            notes[2] = n/2;
            n = n - notes[2]*2;
        }
//---------------------------------------------------------------------
        if(n>=1){
            notes[1] = n;
            n = n - n;   
        }
        
        if(c>=50){
            coins[50] = c/50;
            c = c - coins[50]*50;   
        }
        if(c>=25){
            coins[25] = c/25;
            c = c - coins[25]*25;   
        }
        if(c>=10){
            coins[10] = c/10;
            c = c - coins[10]*10;   
        }
        if(c>=5){
            coins[5] = c/5;
            c = c - coins[5]*5;   
        }
        if(c>=1){
            coins[1] = c;
            c = c - c;
        }

        System.out.println("NOTAS:");
        System.out.println(notes[100] + " nota(s) de R$ 100.00");
        System.out.println(notes[50] + " nota(s) de R$ 50.00");
        System.out.println(notes[20] + " nota(s) de R$ 20.00");
        System.out.println(notes[10] + " nota(s) de R$ 10.00");
        System.out.println(notes[5] + " nota(s) de R$ 5.00");
        System.out.println(notes[2] + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(notes[1] + " moeda(s) de R$ 1.00");
        System.out.println(coins[50] + " moeda(s) de R$ 0.50");
        System.out.println(coins[25] + " moeda(s) de R$ 0.25");
        System.out.println(coins[10] + " moeda(s) de R$ 0.10");
        System.out.println(coins[5] + " moeda(s) de R$ 0.05");
        System.out.println(coins[1] + " moeda(s) de R$ 0.01");
    }
}