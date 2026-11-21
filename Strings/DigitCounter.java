package Strings;

import java.util.*;

public class DigitCounter {

	 public static void main(String[] args) {
	        System.out.println(countDigits(122333));
	        System.out.println(countDigits(1112231));
	    }

	 public static String countDigits(int num) {

	        String str = String.valueOf(num);

	        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

	        for (char digit : str.toCharArray()) {
	            map.put(digit, map.getOrDefault(digit, 0) + 1);
	        }

	        StringBuilder result = new StringBuilder();

	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

	            if (result.length() > 0) {
	                result.append(", ");
	            }

	            int count = entry.getValue();
	            char digit = entry.getKey();

	            result.append(count)
	                  .append(" ")
	                  .append(digit)
	                  .append(count > 1 ? "s" : "");
	        }

	        return result.toString();
	    }

}
