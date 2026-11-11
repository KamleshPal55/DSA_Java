package Arrays;

public class MountainArrayCheck {

	public static void main(String[] args) {
		int[] input = {1, 3, 5, 10, 4, 2, 0};
		System.out.println(mountainArrayCheck(input));
	}
	public static boolean mountainArrayCheck(int[] arr) {
		if(arr == null && arr.length < 3) {
			return false;
		}
		int i=0;
		while((i+1) < arr.length && arr[i] < arr[i+1]){
			i++;
		}
		while((i+1) < arr.length && arr[i] > arr[i+1]) {
			i++;
		}
		return arr.length-1 == i;
	}
}

/*
	Check the way boolean is returning
*/