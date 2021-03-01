package arrays.programs;

import java.util.HashSet;

public class LongestConsequtive {
	public static void main(String[] args) {
		int arr[] = { 3, 9, 1, 10, 4, 20, 2 };

		HashSet<Integer> set = new HashSet<Integer>();
		int longest_length = 0;
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i] - 1)) {
				int no = arr[i];
				while (set.contains(no)) {
					no++;
				}
				if (longest_length < no - arr[i]) {
					longest_length = no - arr[i];
				}

			}
		}

		System.out.println("Longest Length is" + " " + longest_length);
	}

}
