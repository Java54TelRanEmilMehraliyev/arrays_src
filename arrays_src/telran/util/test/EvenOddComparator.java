package telran.util.test;

import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		int result;
		if (o1 % 2 == 0 && o2 % 2 == 0) {
			result = o1.compareTo(o2);
		} else if (o1 % 2 != 0 && o2 % 2 != 0) {
			result = o2.compareTo(o1);
		} else if (o1 % 2 == 0 && o2 % 2 != 0) {
			result = -1;
		} else {
			result = 1;
		}
		return result;
	}
}
