/*
 * 1: Build the frequency map
 * 2: Scan the string sequentially to find the first character with a count of 1
 * 3. Return the first non-repeating character if found
 */

package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {
	public static void main(String[] args) {
		//String str = "kamaleelshhs";
		String str = "swiss";
		char result = firstNonRepeatingChar(str);
		if(result != '0') {
			System.out.println("First non repeating character in string: " + result);	
		}else {
			System.out.println("No non repeating character found!");
		}
		System.out.println(firstNonRepeatingCharIndex(str));
		
	}
	
	//Approach#1: This routine will return first non repeating char in string.
	
	public static char firstNonRepeatingChar(String str) {
		 if (str == null || str.isEmpty()) {
	            //return '\u0000';
			 	return '\0';
	        }
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		char[] charArr = str.toCharArray();
		for(char ch : charArr) {
			if(!hmap.containsKey(ch)) {
				hmap.put(ch, 1);
			}else {
				//hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
				hmap.put(ch, hmap.get(ch)+1);
			}	
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(hmap.get(ch) == 1) {
				return ch;
			}
		}
		//return '\u0000';
		return '\0';
	}
	
	//Approach#2: This routine will return index of first non repeating char in string.
	
	public static int firstNonRepeatingCharIndex(String str) {
		Map<Character, Integer> hmap = new HashMap<>();
		char[] charArr = str.toCharArray();
		
		//Populate frequency map
		for(char ch : charArr) {
			hmap.put(ch, hmap.getOrDefault(ch, 0)+1);
		}
		
		for(int i=0; i<charArr.length; i++) {
			char ch = charArr[i];
			if(hmap.get(ch) == 1) {
				return i;
			}
		}
		return -1;
	}
}







