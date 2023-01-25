
public class SelectionSort {
	
	//	The main function that implements SelectionSort
	void sSort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) 
		{
            // Find the minimum element in unsorted array
			int min_idx=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
				
				//Swap the found minimum element with the first
				int tempVar = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = tempVar;
			}
			
		}
		
	}
	
	// Function to print an array
	static void printArray(int[] arr) {
		for(int n:arr)
			System.out.print(n + " ");
	}

	public static void main(String[] args) {
		/* 5. WAP to sort an array using Selection Sort Algorithm. */
		System.out.println("---- 5. WAP to sort an array using Selection Sort Algorithm ----\n");
		
		int[] arr = {10,7,25,73,44,11};
		
		System.out.println("Given Array: ");
		printArray(arr);
		
		SelectionSort obj = new SelectionSort();
		obj.sSort(arr);
		
		System.out.println("\n\nSelection Sort: ");
		printArray(arr);
		
	}

}
