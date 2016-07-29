//https://www.hackerrank.com/contests/world-codesprint-5/challenges/challenging-palindromes

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		int testCase = ana.nextInt();
		ana.nextLine();

		for(int testCaseChecker=0; testCaseChecker<testCase; testCaseChecker++){

			String firstString = ana.nextLine();
			String secondString = ana.nextLine();

			String[] firstStringArray = allPossibleSubstring(firstString);
			String[] secondStringArray = allPossibleSubstring(secondString);

			if(isUnique(firstString, secondString)){

				System.out.println("-1");
			}else{

				ArrayList<String> palindromicStringsList = new ArrayList<String>();

				for(int i=firstStringArray.length-1; i>=0; i--){

					for(int j=secondStringArray.length-1; j>=0; j--){

						String str = firstStringArray[i] + secondStringArray[j];

						if(isPalindrome(str)){

							palindromicStringsList.add(str);
						}
					}
				}

				String[] palindromicStringsArray = new String[palindromicStringsList.size()];
				System.arraycopy(palindromicStringsList.toArray(), 0, palindromicStringsArray, 0, palindromicStringsList.size());

				sortByLength(palindromicStringsArray);

				// System.out.println("palindromicStringsArray");
				// for(String e : palindromicStringsArray){

				// 		System.out.println(e);
				// }

				if(palindromicStringsArray.length != 0)
					System.out.println(palindromicStringsArray[alphabeticallyFirstPalindrome(palindromicStringsArray)]);
				else
					System.out.println("-1");
			}

		}
	}

	public static boolean isUnique(String fir, String sec){

		ArrayList<Character> foo = new ArrayList<Character>();

		String firSec = fir + sec;

		for(Character val : firSec.toCharArray()){

			if(foo.contains(val)){

				foo.remove(val);
			}else{

				foo.add(val);
			}
		}

		if(firSec.length() <= foo.size()){

			return true;
		}else{

			return false;
		}
	}

	public static String[] allPossibleSubstring(String word) {

		ArrayList<String> foo = new ArrayList<String>();

		for(int i=0; i<word.length(); i++){
			for(int j=i+1; j<=word.length(); j++){

				foo.add(word.substring(i, j));
			}
		}

		String[] finalArray = new String[foo.size()];
		System.arraycopy(foo.toArray(), 0, finalArray, 0, foo.size());

		sortByLength(finalArray);

		// System.out.println("allPossibleSubstring");
		// for(String e : finalArray){

		// 	System.out.println(e);
		// }

		return finalArray;
	}

	public static boolean isPalindrome(String word){

		boolean palindrome = word.equals(new StringBuilder(word).reverse().toString());

		return palindrome;
	}

	public static void sortByLength(String[] strArray){

		for(int i=0; i<strArray.length-1; i++){

			for(int j=i+1; j<strArray.length; j++){

				if(strArray[i].length() > strArray[j].length()){

					String temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}
		}
	}

	public static int alphabeticallyFirstPalindrome(String[] strArray){

		int index = 0;
		int lastIndex = strArray.length-1;

		for(int i=strArray.length-1; i>=0; i--){

			if(strArray[i].length() < strArray[lastIndex].length()){

				index = i+1;
				break;
			}
		}

		Arrays.sort(strArray, index, strArray.length-1);

		return index;
	}
}