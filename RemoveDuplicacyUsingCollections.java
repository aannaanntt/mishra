package arrays.programs;

import java.util.HashSet;

public class RemoveDuplicacyUsingCollections {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 5 , 1};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(int no:set) {
			System.out.print(no+" ");
		}
	}

}
