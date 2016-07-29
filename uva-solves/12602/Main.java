import java.util.Hashtable;
import java.util.Scanner;


public class Main {
    
    public static int digitToInt(String x){
        
        int result = 0;
        
        String po = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        Hashtable<Character, Integer> poof = new Hashtable<Character, Integer>();
        
        for(int i=0; i<po.length(); i++){
            
            poof.put(po.charAt(i), i);
        }
        
        int power = 2;
        
        for(int i=0; i<x.length(); i++){
            
            int a =  poof.get(x.charAt(i));
            a = a * (int) Math.pow(26, power);
            result += a;
            power--;
        }
        
        
        return result;
    }
    
    public static int number(String x){
        
        int result = Integer.parseInt(x);
        
        
        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        int testCase = ana.nextInt();
        ana.nextLine();
        
        for(int k=0; k<testCase; k++){
            
            String x = ana.nextLine();
            
            String fir = "";
            String sec = "";
            
            for(int i=0; i<3; i++){
                
                fir += x.charAt(i);
            }
            
            for(int i=4; i<x.length(); i++){
                
                sec += x.charAt(i);
            }
            
            int alp = digitToInt(fir);
            int num = number(sec);
            
            if( Math.abs( alp - num ) <=100){
                
                System.out.println("nice");
            }else{
                System.out.println("not nice");
            }
        }
    }
    
}