package Strings;

import java.util.Scanner;
import java.util.Set;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Output string is: " + removeVowels(input));
		

	}
	public static String removeVowels(String str) {
		if(str == null || str.isEmpty()) {
			return null;
		}
	
 		Set<Character> vowels = Set.of('a','e','i','o','u');
 		StringBuilder sb = new StringBuilder();
 		char[] charArr = str.toLowerCase().toCharArray();
 		for(Character ch : charArr) {
 			if(!vowels.contains(ch)) {
 				sb.append(ch);
 			}
 		}
 		return sb.toString();
	}
}
