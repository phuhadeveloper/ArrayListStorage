package arrayliststorage;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
	
	// swap method to swap two items in a list
	private static void swap(ArrayList<Student> list, int i, int j ) {
		Student temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
	public static void sort(ArrayList<Student> list, Comparator<Student> comparator) {
		int n = list.size();
		
		for (int i = 0; i < n - 1; i++) {
			// index of the smallest item in the current iteration 
			int min_index = i;
			
			// this loop find the smallest item the current iteration and save the index  
			for (int j = i + 1; j < n; j++) {
				if (comparator.compare(list.get(j), list.get(min_index)) < 0) {
					min_index = j;
				}
			}
			// swap smallest item of current iteration to the starting point of current iteration
			swap(list, i, min_index);
		}
	}
}
