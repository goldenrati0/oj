import java.util.Scanner;

public class allPossibleSubstring{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		allSubstring(ana.nextLine());
	}

	public static void allSubstring(String word){

		for(int i=0; i<word.length(); i++){
			for(int j=i+1; j<=word.length(); j++){

				System.out.println(word.substring(i, j));
			}
		}
	}	
}