/*
 * ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
 *  ArrayList<String> al = new ArrayList<>(List.of(arr));
   
 */

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLeaderNumbers {
	public static void main(String[] args) {
		int[] input = {16, 17, 4, 3, 5, 2};
		//printLeaders(input);
		//List<Integer> result = 
		ArrayList<Integer> result = printLeaders2(input);
		for(Integer num : result) {
			System.out.print( num + " ");
		}
		
	}
	
	//Approach #1: (This will print leaders in reverse order)
	public static void printLeaders(int[] arr) {
		if(arr == null && arr.length < 2) {
			return;
		}
		int currentMax = arr[arr.length-1];
		System.out.print(currentMax + " ");
		
		for(int i = arr.length-2; i >= 0; i--) {
			if(arr[i] > currentMax) {
				currentMax = arr[i];
				System.out.print(currentMax + " ");
			}
		}
	}
	
	public static ArrayList<Integer> printLeaders2(int[] arr){
	
		if(arr == null && arr.length < 2) {
			System.out.println("Leaders can not be calculated");
			return new ArrayList<>();
		}
	
		ArrayList<Integer> result = new ArrayList<>();
		
		int len = arr.length;
		int currLeader = arr[len-1];
		result.add(currLeader);
		
		for(int i = len-2; i >= 0; i--) {
			if(arr[i] > currLeader) {
				result.add(arr[i]);
				currLeader = arr[i];				
			}
		}
		Collections.reverse(result);
		
		return result;
	}

}
