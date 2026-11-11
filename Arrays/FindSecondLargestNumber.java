/**
 * Approach#1: Sort the array and get the second element (element at index 1)
 * 
 */

package Arrays;
import java.util.Arrays;

public class FindSecondLargestNumber {
	public static void main(String[]args) {
		int [] input = {5, 8, 12, 6, 1, 10, 25, 20};
		//int result = findSecondLargestNoUsingSorting(input);
		//System.out.println("Second largest element is: " + result);
		System.out.println("Second largest element is: " + findSecondLargestNoUsingVarComparison(input));
		
	}
	public static int findSecondLargestNoUsingSorting(int[] arr) {
		if(arr == null || arr.length < 2) {
			return -1;
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
			if(i <= 1 && arr[j]>arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Partially sorted array is: " + Arrays.toString(arr));
		return arr[1];
	}
	
	public static int findSecondLargestNoUsingVarComparison(int[] arr) {
		if(arr == null || arr.length < 2) {
			return -1;
		}
		//Arrays.sort(arr);
		System.out.println("Array is: " + Arrays.toString(arr));
		
		int largest = arr[0];
		int secondLargest=arr[1];
		System.out.println("Second element: " + secondLargest);
		for(int i=1; i<arr.length-1; i++) {
			if(arr[i+1] > arr[i]) {
				largest = arr[i+1];
				if(secondLargest > largest) {
					int temp = largest;
					largest = secondLargest;
					secondLargest = temp;
				}	
			}
		
		}System.out.println("Value of secondLargest: " + secondLargest);
		
		return secondLargest;
	}
}

