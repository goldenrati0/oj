import java.util.*;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
		int sLength = s.length();
		int tLength = t.length();

		if (sLength != tLength)
			return false;

		Map<Character, Character> charMap = new HashMap<>();

		for(int i=0; i < sLength; i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

			if(charMap.containsKey(sChar)) {
				if (charMap.get(sChar) != tChar)
					return false;
			} else {
				if (charMap.containsValue(tChar))
					return false;
				charMap.put(sChar, tChar);
			}
		}
		return true;
	}
}