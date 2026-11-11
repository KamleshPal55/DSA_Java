package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 5,  9, 3 , 10, 4, 16, 5, 3, 9, 15, 4};
		System.out.println("Duplicate elements are: ");
		//findDuplicateBruteForce(arr);
		findDuplicateUsingSet(arr);
		findDuplicatesUsingMap(arr);
		
		
	}
	//This method will print duplicate elements multiple times.
	public static void findDuplicateBruteForce(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		//System.out.println("Duplicate elements are: ");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j] && (i != j)) {
					System.out.println(arr[i] + " ");
				}	
			}
		}
	}
	//This method will print duplicate elements multiple times. [o/p: 4 5 3 9 4 ]
	public static void findDuplicateUsingSet(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			if(set.add(num) == false) {  //if num is not getting added to set
				System.out.print(num + " ");
			}
		}
		System.out.println();
		
	}
	
	public static void findDuplicatesUsingMap(int[] arr) {
		if(arr == null || arr.length < 2)
			return;
		Map<Integer, Integer> hmap = new HashMap<>();
		for(int num : arr) {
			if(!hmap.containsKey(num)) {
				hmap.put(num, 1);
			}else {
				hmap.put(num, hmap.get(num)+1);
			}
		}
		System.out.println(hmap);
		System.out.println("Duplicate elements are: ");
		Set<Map.Entry<Integer, Integer>> entrySet = hmap.entrySet(); //Entery is sub interface of Map.
		for(Map.Entry<Integer, Integer> mapEntry : entrySet) {
			if(mapEntry.getValue() > 1) {
				System.out.println(mapEntry.getKey());
			}//if	
		}//for	
	}
}
