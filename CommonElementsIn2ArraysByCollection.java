package arrays.programs;

import java.util.HashSet;

public class CommonElementsIn2ArraysByCollection {
	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 7, 9, 2, 4 };
		int arr2[] = { 5, 1, 4, 8, 3 };
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					set.add(arr1[i]);
					break; 
				}
			}
		}
		
		for(int no:set) {
			System.out.println("Common elements are"+" "+no );
		}
	}

}
