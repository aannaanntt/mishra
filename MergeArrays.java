package arrays.programs;

public class MergeArrays {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30 };
		int arr2[] = { 40, 50, 60, 70 };

		int a_length = arr1.length;
		int b_length = arr2.length;
		int c_length = a_length + b_length;
		int[] c = new int[c_length];
		for (int i = 0; i < arr1.length; i++) {
			c[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			c[arr1.length + i] = arr2[i];
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}
