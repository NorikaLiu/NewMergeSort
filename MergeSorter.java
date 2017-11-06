
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
	int A = lo; 
	int B = mid + 1; // middle of the high and low.
	int C = lo; 
	
	//....
	int[] Apple = new int[list.length+1];
	System.arraycopy(list, lo, Apple, lo, list.length ); 
	while (A <= mid && B <= hi) { 
		if (Apple[A] < Apple [B]) {
			list [A] = Apple [A];
			A++; 
		}
		else {
			list [A] = Apple [B];
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
