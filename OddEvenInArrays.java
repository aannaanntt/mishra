package arrays.programs;

import java.util.ArrayList;

public class OddEvenInArrays {
	
	public static void main(String[] args) {
		int arr[]= {8,5,10,12,3,1,4};
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				al1.add(arr[i]);
			}else {
				al2.add(arr[i]);
			}
		}
		
		
		System.out.println("Even numbers are");
		for(int no:al1) {
			System.out.println(no);
		}
		System.out.println("odd numbers are");
		for(int no:al2) {
			System.out.println(no);
		}
		
	}

}
