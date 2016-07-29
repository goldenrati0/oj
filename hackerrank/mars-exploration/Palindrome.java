public class Palindrome{
	public static void main(String[] args){

		String x = "abba";

		String rev = "";

		for(int i=x.length()-1; i>=0; i--){

			rev = rev + x.charAt(i);
		}

		if(x.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}