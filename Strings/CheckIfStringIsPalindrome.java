/* Palindrome is a string which reads same when read forward and backward.
 * 1. Reverse the string 
 * 2. Check if initial and reversed strings are equal or not 
 */

package Strings;

import java.util.Scanner;

public class CheckIfStringIsPalindrome {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		CheckIfStringIsPalindrome strPalindrome = new CheckIfStringIsPalindrome();
		if(strPalindrome.isStringPalindrome2(input)) {
			System.out.println("String is Palindrome!");	
		}else {
			System.out.println("String IS NOT Palindrome");
		}
	}
	//Approach#1: Using Strings equals class
	public boolean isStringPalindrome1(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			sb.append(ch);		
		}
		if(str.equals(sb.toString()))
			return true;
		else 
			return false;	
		
	}
	//Approach#2: Using two pointer technique
	public boolean isStringPalindrome2(String str) {
		char[] charArr = str.toCharArray();
		int start = 0;
		int end = charArr.length-1;
		while(start < end) {
			if(charArr[start] != charArr[end]) {
				return false;
			}//if
			start++;
			end--;
		}	
		return true;
	}// method
}

