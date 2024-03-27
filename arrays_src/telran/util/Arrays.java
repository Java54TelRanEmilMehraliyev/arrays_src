package telran.util;

import java.util.Comparator;

public class Arrays {
	
	public static <T> int indexOf(T[] array, T element) {
		int index = 0;
		while (index < array.length && !equals(array[index], element)) {
			index++;
		}
		return index == array.length ? -1 : index;
	}

	private static <T> boolean equals(T element1, T element2) {

		return element1 == null ? element1 == element2 : element1.equals(element2);
	}
	
	public static <T> T min(T[] array, Comparator<T> comp) {
		T res = null;
		if(array != null && array.length > 0) {
			res = array[0];
			for(int i = 0; i < array.length; i++) {
				if(comp.compare(res, array[i]) > 0) {
					res = array[i];
				}
			}
		}
		return res;
		
	}

	public static <T> void bubbleSort(T[] array, Comparator<T> comp) {
       int n = array.length;
       for(int i = 0; i < n - 1; i++) {
    	   for(int j = 0; j < n - i - 1; j++) {
    		   if(comp.compare(array[j],array[j + 1]) > 0) {
    			   T temp = array[j];
    			   array[j] = array[j + 1];
    			   array[j + 1] = temp;
    		   }
    	   }
       }
	}
}
