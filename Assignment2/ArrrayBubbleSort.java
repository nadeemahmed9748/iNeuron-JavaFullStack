public class ArrrayBubbleSort {
	
	//	The main function that implements BubbleSort
	void bsort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-1; j++) {
				if(arr[j] < arr[j-1]) 
				{
					//Swap the found minimum element with the first
					int tempVar = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tempVar;
				}
			}
		}
	}
	
	// Function to print an array
	static void printArray(int[] arr) {
		for(int i:arr)
			System.out.print(i + " ");
	}

	public static void main(String[] args) {
		/* 3. WAP to sort an array using Bubble Sort Algorithm. */
		System.out.println("---- 3. WAP to sort an array using Bubble Sort Algorithm ----\n");
		
		int[] arr = {10,7,25,73,44,11};
		
		System.out.println("Given Array: ");
		printArray(arr);
		
		ArrrayBubbleSort obj = new ArrrayBubbleSort();
		obj.bsort(arr);
		
		System.out.println("\n\nBubble Sort: ");
		printArray(arr);

	}

}
