import java.util.Enumeration;
import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<Integer> v=new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		Enumeration<Integer> em=v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
	}

}
