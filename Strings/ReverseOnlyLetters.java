package Strings;

import java.util.Arrays;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		String input = "1ab2d34gh";
		System.out.println("Input: " + input);
		char[] arr = input.toCharArray();
		int left = 0;
		int right = input.length()-1;  // As right and left are pointers indicating indeces
		
		while(left < right) {
			if(!Character.isLetter(arr[left])) {
				left++;
			}else if(!Character.isLetter(arr[right])) {
				right--;
			}else {
				//if left and right both pointing to letters, then swap
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;	
				left++;
				right--;
			}
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println("Output: " + new String(arr));
		

	}

}
