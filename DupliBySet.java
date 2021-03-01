package arrays.programs;

import java.util.HashSet;
import java.util.Set;

public class DupliBySet {
	public static void main(String[] args) {
		
		int arr[] = { 3, 5, 4, 3, 2, 2, 1};
		Set<Integer> set = new HashSet<>();
		for(int no:arr) {
			boolean b=set.add(no);
			if(b==false) {
				System.out.println("Duplicates are"+" "+no);
			}
		}
		
		

	}
}
