class Fan
{
	int cost;
	String brand;
	int noOfWings;
}

public class ArrayEnum 
{

	public static void main(String[] args) 
	{
		
       Fan[] f= new Fan[3];
       
       f[0]=new Fan();
       f[1]=new Fan();
       f[2]=new Fan();
       
       f[0].brand="Hyder";
       f[0].cost=10000;
       
       System.out.println(f[0].brand);
	}

}
