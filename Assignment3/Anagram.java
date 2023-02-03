import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- 5. WAP to implement Anagram Checking least inbuilt methods being used. ----\n");
		
		String s1 = "A Java Developer";
		String s2 = "java deaveloper";
		
		s1 = s1.replace(" ", "").toLowerCase();
		s2 = s2.replace(" ", "").toLowerCase();

		//With sort() method
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch1);
		
		//Without sort() method
		char[] ch2 = s2.toCharArray();
		
		for(int i=0; i<ch2.length-1; i++) {
			int minIdx = i;
			
			for(int j=i+1; j<ch2.length; j++) {
				if(ch2[j] < ch2[minIdx])
					minIdx = j;
			}
			
			//swap
			char tempVar = ch2[minIdx];
			ch2[minIdx] = ch2[i];
			ch2[i] = tempVar;
		}
		
		// compare both char array
		if(Arrays.equals(ch1,ch2))		
			System.out.println("It is an Anagram");
		else
			System.out.println("It is not an Anagram");

	}

}
