import java.util.Arrays;

public class RemoveDuplicates {
	
	static void duplicate(String str) {
		
		char[] ch = str.toCharArray();
		int len = ch.length;
		int index=0;
		
		System.out.println("Original String: " + str);
		for(int i=0; i<len; i++) {
			int j;
			for(j=0; j<len; j++) {
				
				if(ch[i] == ch[j]) 
					break;
			}
			
			if(j==i)
				ch[index++]=ch[i];
		}
		System.out.println("Removed duplicates String: " + String.valueOf(Arrays.copyOf(ch, index)));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- 1. WAP to remove Duplicates from a String.(Take any String ex with duplicates character) ----\n");
		String s ="geeksforgeeks";
		
		duplicate(s);
	}
	
}

