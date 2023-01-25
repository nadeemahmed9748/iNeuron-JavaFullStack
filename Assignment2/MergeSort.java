
public class MergeSort {
	
	// Main function that implements MergeSort
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }    
        
    // Merges two sub arrays of arr[].
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two sub arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

	// Function to print an array
	static void printArray(int[] arr) {
		for(int n:arr)
			System.out.print(n + " ");
	}

	public static void main(String[] args) {
		/* 4. WAP to sort an array using Merge Sort Algorithm. */
		System.out.println("---- 4. WAP to sort an array using Merge Sort Algorithm ----\n");
		
		int[] arr = {10,7,25,73,44,11};
		
		System.out.println("Given Array: ");
		printArray(arr);
		
		int n = arr.length;
		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, n - 1);
		
		System.out.println("\n\nQuick Sort: ");
		printArray(arr);

	}

}
