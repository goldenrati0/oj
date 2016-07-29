import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        while(ana.hasNext()){
            
            int type = ana.nextInt();
            int counter = 0;
            
            ana.nextLine();
            
            String x = ana.nextLine();
            
            Scanner ana2 = new Scanner(x);
            
            while(ana2.hasNextInt()){
                
                if(ana2.nextInt() == type){
                    counter++;
                }
            }
            
            System.out.println(counter);
        }
    }
}