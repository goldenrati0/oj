/*
 *This solution just works completely fine and gives expected outputs.
 *Status: Wrong Answer
 *Trying to figure out what is messed up here
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws Exception {

		BufferedReader ana = new BufferedReader(new InputStreamReader(System.in));
		String input;

		while((input = ana.readLine()) != null){

			if(!input.isEmpty()){

				String decodedMsg = "";

				for(int i=0; i<input.length(); i++){

					decodedMsg += (char) (input.codePointAt(i) - 7);
				}

				System.out.println(decodedMsg);
			}else break;
		}
	}
}