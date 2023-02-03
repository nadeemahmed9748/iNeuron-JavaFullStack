import java.util.Arrays;

public class MaxOccurance {
	
	static void maxOccur(String str) {
		
		System.out.println("Original String: " + str + "\n");
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		
		str = new String(ch);
		int count = 1;
		int max = 0;
		int len=str.length();
		char c = 0;
		
		for(int i=1; i<=str.length(); i++) {
			if((i==len)  || (str.charAt(i) != str.charAt(i-1)))
			{
				if(max < count) {
					max = count;
					c = str.charAt(i-1);
				}
				count = 1;
			}else {
				count++;
			}	
		}
		
		System.out.println("Max Occurring character : " + c);
		System.out.println("Numner of times : " + max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- 8. WAP to find the maximum occurring character in a String. ----\n");
		String s = "geeksforgeeks";
		maxOccur(s);

	}

}
