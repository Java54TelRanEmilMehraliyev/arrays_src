package telran.util;

import java.util.Comparator;
import java.util.function.Predicate;

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
	public static <T>int binarySearch(T[] array, T key, Comparator<T> comp) {
		//TODO
				//left index = 0
				//right index = array.length - 1
				//middle (left + right) / 2
				//left part - left index, right index = middle - 1
				//right part - left index = middle + 1, right index
				//while left <= right
				//returns exactly what the standard binarySearch does
				//if there are several equaled elements no guarantee that
				// being returned index is the one to first occurrence 
		
		return -1;
	}
	public static <T> T[] removeIf(T[] array, Predicate<T> predicate) {
		//TODO
		//removes all elements of array matching a given predicate
		return null;
	}
	
	public static <T> T[] search(T[] array, Predicate<T> predicate) {
		T[] arResult = java.util.Arrays.copyOf(array, array.length);
	    int index = 0;
	    for(int i = 0; i < array.length; i++) {
	    	if(predicate.test(array[i])) {
	    		arResult[index++] = array[i];
	    	}
	    }
	    return java.util.Arrays.copyOf(arResult,index);     
	}
}
