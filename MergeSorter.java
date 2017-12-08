
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		/*
		 * This function implements the merge sort algorithm on the integer array 'list'
		 * from index lo to index hi.
		 */
		
		if (lo < hi) {
			int mid = (lo + hi) / 2;
			mergeSort (list, lo, mid);
			mergeSort(list, mid + 1, hi );
			merge (list, lo, mid, hi);
		}
	}
	
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		/*
		 * This method should merge the two subarrays from lo to mid, and
		 * from mid + 1 to hi into a new sorted array that overwrites
		 * the entries in list from lo to hi.
		 */
	
	
	//....
	int[] Apple = new int[list.length+1];
	System.arraycopy(list, 0, Apple, 0, list.length ); 
	
	int A = lo; 
	int B = mid + 1; // middle of the high and low.
	int C = lo; 
	
	while (A <= mid && B <= hi) { 
		if (Apple[A] < list [B]) {
			list [C] = Apple [A];
			A++; 
		}
		else {
			list [C] = Apple [B];
			B++;
			
		}
		C++; 
	}
		while (A<=mid) {
			list [C] = Apple[A];
			A++;
			C++;
			
		}
	}	
	
	}	
