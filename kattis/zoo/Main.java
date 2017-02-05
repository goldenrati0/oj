import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tahmid
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        int test = 1;
        
        for(; ana.hasNext();) {
            
            int num = ana.nextInt();
            ana.nextLine();
            
            if(num == 0)
                break;
            
            Hashtable<String, Integer> typesCount = new Hashtable<>();
            String temp = "", key = "";
            String[] temp2 = null;
            
            for(int i=0; i<num; i++) {
                
                temp = ana.nextLine().toLowerCase();
                temp2 = temp.split(" ");
                
                if(temp2.length == 1) {
                    key = temp2[0];
                } else {
                    key = temp2[temp2.length-1];
                }
                
                if(typesCount.containsKey(key)) {
                    Integer value = typesCount.remove(key);
                    value = value + 1;
                    typesCount.put(key, value);
                } else {
                    typesCount.put(key, 1);
                }
            }
            
            List<String> allKeys = Collections.list(typesCount.keys());
            Collections.sort(allKeys);
            
            System.out.println("List " + test + ":");
            test++;
            
            allKeys.forEach((keyString) -> {
                System.out.println(keyString + " | " + typesCount.get(keyString));
            });
        }
    }
}