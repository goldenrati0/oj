/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tahmid
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        
        int testcase = ana.nextInt();
        
        for(int tc=0; tc<testcase; tc++) {
            
            ArrayList<String> lang = new ArrayList<String>();
            
            int num = ana.nextInt();
            String temp = "";
            
            for(int i=0; i<num; i++) {
                
                temp = ana.next();
                
                if(!lang.contains(temp)) {
                    lang.add(temp);
                }
            }
            
            if(lang.size() > 1) {
                System.out.println("ingles");
            } else {
                System.out.println(lang.get(0));
            }
        }
    }
}
