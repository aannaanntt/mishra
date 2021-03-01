package arrays.programs;

import java.util.*;

public class DupliByHash {
	public static void main(String[] args) {

		int arr[] = { 3, 5, 4, 3, 2, 2, 1, 2, 3 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int a : arr) {
			Integer count = map.get(a);
			if (count == null) {
				map.put(a, 1);
			} else {
				count++;
				map.put(a, count);
			}

		}

		Set<Map.Entry<Integer, Integer>> es = map.entrySet();
		for (Map.Entry<Integer, Integer> me : es) {
			if (me.getValue() > 1) {
				System.out.println(me.getKey());
			}
		}

	}

}
