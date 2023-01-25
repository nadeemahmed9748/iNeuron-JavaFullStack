
public class QuickSort {
	
	//	The main function that implements QuickSort
	void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
 
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);
 
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
	
	static int partition(int[] arr, int low, int high)
    {
 
        // pivot
        int pivot = arr[high];
 
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
	
	// A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
    // Function to print an array
	static void printArray(int[] arr) {
		for(int n:arr)
			System.out.print(n + " ");
	}

	public static void main(String[] args) {
		/* 2. WAP to sort an array using Quick Sort Algorithm. */
		System.out.println("---- 2. WAP to sort an array using Quick Sort Algorithm ----\n");
		
		int[] arr = {10,7,25,73,44,11};
		
		System.out.println("Given Array: ");
		printArray(arr);
		
		int n = arr.length;
		QuickSort obj = new QuickSort();
		obj.quickSort(arr, 0, n - 1);
		
		System.out.println("\n\nQuick Sort: ");
		printArray(arr);

	}

}
