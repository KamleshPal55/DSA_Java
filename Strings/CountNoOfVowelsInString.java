package Strings;

public class CountNoOfVowelsInString {

	public static void main(String[] args) {
		String input = "Hellokamleshpal";
		System.out.println("Input: " + input);
		String vowels = "aeiouAEIOU";
		
		char[] arr = input.toCharArray();
		int count =0;
	
		for(int i=0; i<arr.length; i++) {
			if(vowels.indexOf(arr[i]) != -1) {
				count++;
			}
		}
		System.out.println("No of vowels in the string: " + count);

	}

}
