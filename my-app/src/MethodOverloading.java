
// Method overloading with Numeric type promotion
class Calculator4
{
	
	float add(float a, int b)
	{
		return a+b;
	}
	
	float add(float a, float b, int c)
	{
		return a+b+c;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator4 cal=new Calculator4();
		System.out.println(cal.add(10.5f, 20));

	}

}
