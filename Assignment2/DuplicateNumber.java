import java.util.*;

public class DuplicateNumber {
	
	static void duplicate(int[] arr) {

		int count=1;
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] == arr[i-1]) {
				count++;
			}else {
				if(count > 1) {
					System.out.println("Duplicate element: " + arr[i-1] + ", No. of times: " + count);
				}
				count = 1;
			}
		}
	}
	
	static void sort(int[] arr) {
		Arrays.sort(arr);
	}
	
	static void printArray(int[] arr) {
		for(int n:arr)
			System.out.print(n + " ");
	}
	
	public static void main(String args[]) {
		
		/* 1. WAP to find the duplicates present in an array. */
		System.out.println("---- 1. WAP to find the duplicates present in an array ----\n");
		int[] arr = {7,10,3,22,30,10,9,3,10};
		
		System.out.println("Given Array: ");
		printArray(arr);
		System.out.println("\n"); 
		
		sort(arr);
		
		duplicate(arr);
		
	}
}
