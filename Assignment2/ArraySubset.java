
public class ArraySubset {
	
	static boolean isSubset(int[] a1, int[] a2, int m, int n) {
		int j=0;
		for(int i=0; i<n; i++) {
			for(j=0; j<m; j++) {
				if(a2[i] == a1[j]) {
					break;
				}
			}	
			if (j == m)
	            return false;
		}
		return true;
	}

	public static void main(String[] args) {
		/* 6. WAP to check whether an array is a subset of another array. */
		System.out.println("---- 6. WAP to check whether an array is a subset of another array ----\n");
		
		int[] arr1 = {1,10,7,44,25,73};
		int[] arr2 = {10,44,73};
		
		int m = arr1.length;
        int n = arr2.length;
 
        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print("arr2[] is not a subset of arr1[]");
		

	}

}
