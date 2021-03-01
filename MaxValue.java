package arrays.programs;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int arr[] = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.print("Max is" +" "+ max);

	}
}
