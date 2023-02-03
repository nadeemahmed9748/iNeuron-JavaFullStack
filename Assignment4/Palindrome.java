
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- 3. WAP to check if “2552” is palindrome or not. ----\n");
		String s1 = "";
		String s2 = "2552";
		
		for(int i=s2.length()-1; i>=0; i--) {
			s1 = s1 + s2.charAt(i);
		}
		
		if(s1.equals(s2))
			System.out.println("String " + s2 + " is a palindrome");
		else
			System.out.println("String " + s2 + " is not a palindrome");
	}

}
