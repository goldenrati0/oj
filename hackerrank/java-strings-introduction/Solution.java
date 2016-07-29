//https://www.hackerrank.com/challenges/java-strings-introduction

import java.util.Scanner;

public class Solution{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		String a = ana.nextLine();
		String b = ana.nextLine();

		System.out.println(a.length() + b.length());

		if(a.compareTo(b) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");


		a = (char) (a.codePointAt(0) - 32) + a.substring(1, a.length());
		b = (char) (b.codePointAt(0) - 32) + b.substring(1, b.length());

		System.out.println(a + " " + b);
	}
}