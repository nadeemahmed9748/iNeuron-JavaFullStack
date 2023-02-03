
class TotalCount{
	
	void count(String s) {
		int vCount = 0, sCount = 0, cCount = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			char ch = Character.toUpperCase(s.charAt(i));
			if ((ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') && ch >= 65 && ch <= 90) {
				vCount++;
			}else if (ch>='A' && ch <='U') {
				cCount++;
			}else if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch)) {
				sCount++;
			}
		}
		
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
		System.out.println("Number of special characters: " + sCount);
		
	}
}

public class CharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- 4. WAP to count the number of consonants, vowels, special characters in a String. ----\n");
		String str = "abc de #@ 12!";
		System.out.println("Original String: " + str);
		
		TotalCount obj = new TotalCount();
		obj.count(str);
		
	}

}
