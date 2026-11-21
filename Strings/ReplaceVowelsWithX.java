package Strings;

public class ReplaceVowelsWithX {

	public static void main(String[] args) {
		String input = "Hellokamleshpal";
		System.out.println("Input: " + input);
		String vowels = "aeiouAEIOU";
		
		char[] arr = input.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(vowels.indexOf(arr[i]) != -1) {
				arr[i] = 'X';			
			}	
		}
		
		System.out.println("Output: " + new String(arr));

	}

}
