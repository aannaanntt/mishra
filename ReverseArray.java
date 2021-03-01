package arrays.programs;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 2, 11, 5, 10, 7, 8 };

		int start = arr[0];
		int end = arr[arr.length - 1];
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i]);
		}
	}

}
