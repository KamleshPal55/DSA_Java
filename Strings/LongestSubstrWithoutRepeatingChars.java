package Strings;

import java.util.HashMap;

public class LongestSubstrWithoutRepeatingChars {

	public static void main(String[] args) {
		String str = "kamleshpal"; //"pwwpkw";
		//int length = lengthOfLongestSubstring1(str);
		//System.out.println("Length of longest substring without repeating character is: " + lengthOfLongestSubstrUsingHashMap(str));
		System.out.println("Length of longest substring without repeating character is: " + lengthOfLongestSubstrUsingAsciiArr(str));
		
	}
	
	public static int lengthOfLongestSubstrUsingHashMap(String str) {
		int left = 0, right = 0;
		int maxLen = 0;
		HashMap<Character, Integer> hmap = new HashMap<>();
		while(right < str.length()) {
			char currentChar = str.charAt(right);
			if(hmap.containsKey(currentChar)) {
				int lastIndex = hmap.get(currentChar); //This will return index of current char
				int newLeft = lastIndex + 1;
				
				if(newLeft > left) {
					left = newLeft;
				}		
			}//if
			hmap.put(currentChar, right);
			int currentWindowsize = right -left + 1;
			if(currentWindowsize > maxLen) {
				maxLen = currentWindowsize;
			}
			right++;
			
		}//while	
		return maxLen;
	}
	
	public static int lengthOfLongestSubstrUsingAsciiArr(String str) {
		int left = 0, right =0;
		int[] arr = new int[256];
		int maxLen = 0;
		
		while(right < str.length()) {
			char currentChar = str.charAt(right);
			int currentCharAscii = (int) currentChar;
			
			arr[currentCharAscii] = arr[currentCharAscii] + 1;
			
			while(arr[currentCharAscii] > 1) {
				
				char leftChar = str.charAt(left);
				int leftCharAscii = (int)leftChar;
				arr[leftCharAscii] = arr[leftCharAscii] - 1;
				left++;	
			}
			int currentWindowSize = right -left + 1;
			if(currentWindowSize > maxLen) {
				maxLen = currentWindowSize;
			}
			right++;
			
		}
		return maxLen;
		
	}

}
