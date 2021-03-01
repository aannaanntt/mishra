package arrays.programs;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int arr[] = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("Minimum value is" + " " + min);

	}

}
