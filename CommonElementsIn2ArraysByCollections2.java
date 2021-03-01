package arrays.programs;

import java.util.HashSet;

public class CommonElementsIn2ArraysByCollections2 {
	
	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 7, 9, 2, 4 };
		int arr2[] = { 5, 1, 4, 8, 3,5 };
		
	
		HashSet<Integer> set1 = new HashSet<>();
		for(int no: arr1) {
			set1.add(no);
		}
		for(int no: arr2) {
			boolean b=set1.add(no);
			if(b==false) {
				System.out.println("Duplicate elemets are"+" "+no);
			}
		}
		
	}

}
