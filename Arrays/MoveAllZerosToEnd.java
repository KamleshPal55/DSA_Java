package Arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int[] input = {1, 0, 2, 0, 3, 4, 0, 5};
		int len = input.length;
		//We're going to have two pointers pointing to indices.
		int putNonZeroAt = 0; 
		
		for(int current = 0; current < len; current++) {
			if(input[current] != 0) {
				//swap
				int temp = input[putNonZeroAt];
				input[putNonZeroAt] = input[current];
				input[current] = temp;
				putNonZeroAt++;	
			}
		}
//		for(int num : input) {
//			System.err.print(num + " ");
//		}
		System.out.println(Arrays.toString(input));
	}

}
