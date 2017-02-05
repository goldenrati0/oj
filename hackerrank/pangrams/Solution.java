import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);

        boolean[] present = new boolean[26];

        String x = ana.nextLine();
        x = x.toLowerCase();

        for(int i=0; i<x.length(); i++) {

        	int ascii = x.codePointAt(i);
            
            if(ascii != 32) {
        	   present[ascii-97] = true;
            }
        }

        boolean flag = true;

        for(int i=0; i<present.length; i++) {

        	if(!present[i]) {

        		flag = false;
        	}
        }

        if(flag) {
        	System.out.println("pangram");
        }else {
        	System.out.println("not pangram");
        }
    }
}