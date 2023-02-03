
public class Pangram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("---- 6. WAP to implement pangram Checking least inbuilt methods being used. ----\n");
		
		boolean flag=false;
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		s1=s1.replace(" ", "");
		
		char[] ch=s1.toCharArray();
		
		int[] ar=new int[26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;  //ar[19]++ --> 0++ --> 1++ --->2
			//ar[ch[i]-65]++;
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
		System.out.println("It's pangram");
		}
	}

}
