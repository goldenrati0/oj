import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
     	Scanner ana = new Scanner(System.in);  
 
        String input = "";
 
        while(true) {
 
            input = ana.nextLine();
            
            if(input.equals("DONE"))
                break;
 
        	input = input.replaceAll("[^a-zA-Z]", "");
 
        	if(isPalindrome(input)){
           		System.out.println("You won't be eaten!");
        	} else {
            	System.out.println("Uh oh..");
        	}
        }

    }
 
 
    public static boolean isPalindrome(String input){
        return new StringBuilder(input).reverse().toString().equalsIgnoreCase(input);
    }
}