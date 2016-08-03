// Status: Correct

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Arrays;

public class Main{

	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		int testCase = ana.nextInt();

		String largestUniqueAplhName = "";

		ArrayList<String> sameLengthAlphName = new ArrayList<String>();
		Hashtable<String, Integer> allNameAndUniqueAlphCount = new Hashtable<String, Integer>();

		for(int testCase_i=1; testCase_i<=testCase; testCase_i++){

			int n = ana.nextInt();
			ana.nextLine();

			String[] allNameArray = new String[n];

			sameLengthAlphName.clear();
			largestUniqueAplhName = "";
			allNameAndUniqueAlphCount.clear();
			allNameAndUniqueAlphCount.put("", 0);

			for(int i=0; i<allNameArray.length; i++){

				allNameArray[i] = ana.nextLine();
			}

			for(int i=0; i<allNameArray.length; i++){

				ArrayList<Character> uniqueCharacterCount = new ArrayList<Character>();

				for(Character e : allNameArray[i].toCharArray()){

					if(uniqueCharacterCount.contains(e) || e == ' '){

					}else{

						uniqueCharacterCount.add(e);
					}
				}

				
				Integer totalUniqueCharacterInString = uniqueCharacterCount.size();

				allNameAndUniqueAlphCount.put(allNameArray[i], totalUniqueCharacterInString);

				if( ( allNameAndUniqueAlphCount.get(largestUniqueAplhName) != allNameAndUniqueAlphCount.get(allNameArray[i]) ) && ( allNameAndUniqueAlphCount.get(largestUniqueAplhName) < allNameAndUniqueAlphCount.get(allNameArray[i]) ) ) {

					largestUniqueAplhName = allNameArray[i];
					sameLengthAlphName.clear();
					sameLengthAlphName.add(allNameArray[i]);
				}
				else if(allNameAndUniqueAlphCount.get(largestUniqueAplhName) == allNameAndUniqueAlphCount.get(allNameArray[i])){

					sameLengthAlphName.add(allNameArray[i]);
				}
			}

			String[] sameLengthAlphNameArray;
			Object[] balChaal = sameLengthAlphName.toArray();
			sameLengthAlphNameArray = new String[balChaal.length];
			System.arraycopy(balChaal, 0, sameLengthAlphNameArray, 0, balChaal.length);

			if(sameLengthAlphNameArray.length == 1){
				System.out.println("Case #" + testCase_i + ": " + sameLengthAlphNameArray[0]);
			}else if(sameLengthAlphNameArray.length > 1){

				Arrays.sort(sameLengthAlphNameArray);

				System.out.println("Case #" + testCase_i + ": " + sameLengthAlphNameArray[0]);
			}
		}
	}
}