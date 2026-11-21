package Strings;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		String input = "Hellokamleshpal";
		System.out.println("Input: " + input);
		String vowels ="aeiouAEIOU";
		char[] arr = input.toCharArray();
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			if(vowels.indexOf(arr[left]) == -1) {
				left++;
			}else if(vowels.indexOf(arr[right]) == -1) {
				right --;
			}else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println("Output: " + new String(arr));
		

	}

}
