import java.util.Arrays;

public class PrintDuplicates {
	
	static void duplicate(String str) {
		
		System.out.println("Original String: " + str + "\n");
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		
		str = new String(ch);
		int count = 1;
		int len=str.length();
		
		for(int i=1; i<=str.length(); i++) {
			if((i==len)  || (str.charAt(i) != str.charAt(i-1)))
			{
				if(count > 1) {
					System.out.println("Duplicate: " + str.charAt(i-1) + " | Count: " + count);
				}
				count = 1;
			}else {
				count++;
			}	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- 2. WAP to print Duplicates characters from the String. ----\n");
		String s = "geeksforgeeks";
		duplicate(s);

	}

}
