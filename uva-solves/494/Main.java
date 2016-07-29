import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner ana = new Scanner(System.in);

		while(ana.hasNext()){

			String[] x = ana.nextLine().split(" ");

			int wordsCounted = 0;

			for(String val : x){

				if(hasAnyLetterInIt(val)){

					wordsCounted++;
				}
			}
			
			System.out.println(wordsCounted);
		}
	}

	public static boolean hasAnyLetterInIt(String x) {

		for(int i=0; i<x.length(); i++){

			if(Character.isLetter(x.charAt(i))) {

				return true;
			}
		}

		return false;
	}
}