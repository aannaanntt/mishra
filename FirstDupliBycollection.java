package arrays.programs;

import java.util.HashSet;

public class FirstDupliBycollection {

	public static void main(String[] args) {
		int arr[] = { 6, 5, 3, 2, 5, 1, 2, 4 };
		HashSet<Integer> set = new HashSet<>();
		int temp = -1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i])) {
				temp = i;
			} else {
				set.add(arr[i]);
			}
		}

		if (temp != -1) {
			System.out.println("Fiest duplicate element is" + " " + arr[temp]);
		}else {
			System.out.println("No duplicates present");
		}

	}

}
