import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int counter = 1;
        
        for(int i=0; i<s.length(); i++){
            
            if(s.codePointAt(i)>=65 && s.codePointAt(i)<=95){
                
                counter += 1;
            }
        }
        
        System.out.println(counter);
    }
}
