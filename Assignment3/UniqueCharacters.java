import java.util.Arrays;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- 7. WAP to find if String contains all unique characters. ----\n");
		
		String str = "Ineuron";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();	
		Arrays.sort(ch);
		
		boolean flag = false;
		int len = ch.length;
		
		for(int i=1; i<len; i++) {
			if((i == len) || (ch[i] == ch[i-1])) {
				flag = true;
				break;
			}
		}

		if(flag == true)
			System.out.println("String not contain all unique characters");
		else
			System.out.println("String contain all unique characters");

	}

}

