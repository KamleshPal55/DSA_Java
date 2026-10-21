package Strings;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

public static void main(String[] args) {
	System.out.print("Enter string: ");
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	scan.close();
	System.out.println("Original string: " + str);
	System.out.println("Reversed string: " + reverseString1(str));

	}

	//Using two pointer approach
	public static String reverseString1(String str) {
		char[] arr = str.toCharArray();
		int start;
		int end = arr.length-1;
		char temp;
		for(start = 0; start < end; start++, end--) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		//return Arrays.toString(arr);
		return new String(arr);
	}

	//Using Java Stack class
	public static String reverseString2(String str) {
		
		Stack<Character> stack = new Stack<>();
		char[]charArr = str.toCharArray();
		
		for(char ch : charArr) {
			stack.push(ch);
		}
		for(int i=0; i< str.length(); i++) {
			charArr[i] = stack.pop();
		}
		return new String(charArr);
	}
}