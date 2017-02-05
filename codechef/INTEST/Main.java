import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
 
		Scanner ana = new Scanner(System.in);
 
 
		long testCase = ana.nextInt();
		long divider = ana.nextInt();
		int counter = 0;
 
		for(long i_testcase = 1; i_testcase<=testCase; i_testcase++){
 
			if(ana.nextInt() % divider == 0){
				counter++;
			}
 
		}
 
		System.out.println(counter);
	}
}