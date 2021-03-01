package arrays.programs;

public class SecondLargest {
	public static void main(String[] args) {

		int arr[] = { 6, 9, 8, 2, 4, 3, 1, 5, 7 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				
				}
			}
			if(i==1) {
				break;
			}
			

		}
		System.out.print("Second largest element is" + " " + arr[1]);

	}
}
