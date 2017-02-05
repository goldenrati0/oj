import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
 
		Scanner ana = new Scanner(System.in);
 
		float withdrawAmount = ana.nextFloat();
		float balance = ana.nextFloat();
 
		if(withdrawAmount%5 != 0){
			System.out.printf("%.2f\n", balance);
		}else{
 
			withdrawAmount += 0.50;
 
			if(withdrawAmount > balance){
				System.out.printf("%.2f\n", balance);
			}else{
 
				float temp = balance - withdrawAmount;
				System.out.printf("%.2f\n", temp);
			}
		}
	}
}