
class Calculator5
{	
	
	float add(float a, int b)
	{
		return a+b;
	}
	
	float add(int c, float a)
	{
		return a+c;
	}
}
public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator5 cal=new Calculator5();
    float fVal = cal.add(10, 20f);
    
    int val = (int) cal.add(10, 20f); // Type cast from float to int
    
    System.out.println(fVal +" <--> "+ val);
	}

}
