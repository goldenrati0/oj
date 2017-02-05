import java.util.*;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tahmid
 */
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
        
        int test = ana.nextInt();
//        ana.nextLine();
        
        for(int tc=0; tc<test; tc++) {
            
            StringBuilder str = new StringBuilder(ana.nextLine());
            
            String temp = str.toString();
            
            int count = 0;
            
            count += (str.length() - temp.replaceAll("1", "").length())*2;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("2", "").length())*5;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("3", "").length())*5;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("4", "").length())*4;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("5", "").length())*5;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("6", "").length())*6;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("7", "").length())*3;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("8", "").length())*7;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("9", "").length())*6;
            temp = str.toString();
            count += (str.length() - temp.replaceAll("0", "").length())*6;
            
            System.out.println(count + " leds");
        }
    }
}
