import java.util.Scanner;
import java.util.ArrayList;

/*
 * This class checks if any of the ANAGRAM
 * of the input STRING can be a palindrome or not!
 *
 * If at least one ANAGRAM can be a palindrome
 * then it prints out "YES" and "NO" otherwise.
 */

public class palindromeCheck{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		String x = "";
		ArrayList<Character> poof = new ArrayList<Character>();

		while(ana.hasNext()){

			x = ana.nextLine();
			poof.clear();

			for(char val : x.toCharArray()){

				if(poof.contains(val)){

					poof.remove(poof.indexOf(val));
				}else{

					poof.add(val);
				}
			}

			if(poof.size() <=1 ){

				System.out.println("YES");
			}else{

				System.out.println("NO");
			}			

		}
	}	
}